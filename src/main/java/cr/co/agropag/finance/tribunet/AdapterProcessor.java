package cr.co.agropag.finance.tribunet;

import com.google.auto.service.AutoService;
import org.springframework.stereotype.Service;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.MirroredTypeException;
import javax.lang.model.type.MirroredTypesException;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.*;
import java.util.stream.Collectors;

import static javax.tools.Diagnostic.Kind.ERROR;
import static javax.tools.Diagnostic.Kind.NOTE;

@AutoService(Processor.class)
public class AdapterProcessor extends AbstractProcessor {

    static final String suffix = "Factory";
    private Messager messager;

    @Override
    public synchronized void init(ProcessingEnvironment environment) {
        super.init(environment);
        this.messager = environment.getMessager();
        messager.printMessage(NOTE, "Initialize " + this.getClass().getName());
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return Collections.singleton(Adapt.class.getCanonicalName());
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        boolean result = false;

        Map<String, String> adapters = new HashMap<>();

        for (Element element : roundEnvironment.getElementsAnnotatedWith(Adapt.class)) {
            final Adapt adapt = element.getAnnotation(Adapt.class);
            final TypeElement clazz = (TypeElement) element;
            final String className = getQualifiedName(clazz);
            for (String target : getQualifiedNames(adapt)) {
                adapters.put(target, className);
            }
        }

        try {
            for (Element element : roundEnvironment.getElementsAnnotatedWith(Adapt.class)) {
                final Adapt adapt = element.getAnnotation(Adapt.class);
                final TypeElement clazz = (TypeElement) element;
                final String className = getQualifiedName(clazz);
                final String packageName = element.getEnclosingElement().toString();
                final String factoryName = className + suffix;
                messager.printMessage(NOTE, String.format("Generating %s", factoryName));
                final JavaFileObject file = processingEnv.getFiler().createSourceFile(factoryName);
                try (PrintWriter writer = new PrintWriter(file.openWriter())) {

                    for (Map.Entry<String, String> entry : adapters.entrySet()) {
                        writer.printf("// Adapter %s -> %s\n", entry.getKey(), entry.getValue());
                    }

                    if (packageName != null) {
                        writer.printf("package %s;\n\n", packageName);
                    }

                    for (Class<?> dependency : new Class[]{
                            Service.class,
                    }) {
                        writer.printf("import %s;\n", dependency.getName());
                    }
                    writer.println();
                    writer.printf("@%s(\"%s\")\n", Service.class.getName(), simpleName(factoryName));
                    writer.printf("public final class %s implements %s {\n", simpleName(factoryName), AdapterFactory.class.getName());
                    for (String target : getQualifiedNames(adapt)) {
                        writer.println();
                        writer.printf("\tstatic final class %s implements %s {\n\n", toSafeName(target), className);
                        String targetClassName = target;
                        if (adapt.inner()) {
                            int index = targetClassName.lastIndexOf('.');
                            targetClassName = targetClassName.substring(0, index) + "$" + targetClassName.substring(index + 1);
                        }
                        Class<?> targetClazz = Class.forName(targetClassName);
                        writer.printf("\t\tprivate final %s target;\n\n", target);
                        writer.printf("\t\t%s(%s target) {\n", toSafeName(target), target);
                        writer.printf("\t\t\tthis.target = target;\n", toSafeName(target), target);
                        //List<Element> elements = new ArrayList<>(clazz.getEnclosedElements());
                        //clazz.getInterfaces().forEach(o -> elements.addAll(((TypeElement) o).getEnclosedElements()));
                        for (Element childElement : clazz.getEnclosedElements()) {
                            switch (childElement.getKind()) {
                                case METHOD:
                                    try {
                                        final String getter = childElement.getSimpleName().toString();
                                        final Method method = targetClazz.getDeclaredMethod(getter);
                                        final String returnType = method.getReturnType().getName().replace('$', '.');
                                        final String type = adapters.getOrDefault(returnType, returnType);
                                        if (!type.equals(returnType)) {
                                            writer.printf("\t\t\t%s = new %s.%s(target.%s());\n", getter, factoryName(type), toSafeName(returnType), getter);
                                        }
                                    } catch (NoSuchMethodException e) {

                                    }
                                    break;
                            }
                        }
                        writer.println("\t\t}\n");
                        for (Element childElement : clazz.getEnclosedElements()) {
                            switch (childElement.getKind()) {
                                case METHOD:
                                    try {
                                        final String getter = childElement.getSimpleName().toString();
                                        final Method method = targetClazz.getMethod(getter);
                                        final String returnType = method.getReturnType().getName().replace('$', '.');
                                        final String type = adapters.getOrDefault(returnType, returnType);
                                        if (type.equals(returnType)) {
                                            if (type.equals(javax.xml.bind.JAXBElement.class.getName())) {
                                                final ParameterizedType parameterizedType = (ParameterizedType) method.getGenericReturnType();
                                                final String genericType = parameterizedType.getActualTypeArguments()[0].getTypeName();
                                                writer.printf("\t\tpublic final %s %s() { return target.%s().getValue(); }\n\n", genericType, getter, getter);
                                            } else {
                                                writer.printf("\t\tpublic final %s %s() { return target.%s(); }\n\n", type, getter, getter);
                                            }
                                        } else {
                                            writer.printf("\t\tprivate final %s %s;\n\n", type, getter);
                                            writer.printf("\t\tpublic final %s %s() { return %s; }\n\n", type, getter, getter);
                                        }
                                    } catch (NoSuchMethodException e) {

                                    }
                                    break;
                            }
                        }
                        writer.println("\t}");
                    }
                    writer.println();
                    writer.println("\tprivate static final Class<?>[] supportedClasses = new Class[] {");
                    for (String target : getQualifiedNames(adapt)) {
                        writer.printf("\t\t%s.class,\n", target);
                    }
                    writer.println("\t};\n\n");
                    writer.println("\tpublic final Class<?>[] supportedClasses() { return supportedClasses; }\n\n");
                    writer.println("\tpublic <T> T adapt(Object target) {");
                    for (String target : getQualifiedNames(adapt)) {
                        writer.printf("\t\tif (target instanceof %s) return (T) new %s((%s) target);\n", target, toSafeName(target), target);
                    }
                    writer.println("\t\treturn null;");
                    writer.println("\t};");
                    writer.println("}");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    messager.printMessage(ERROR, e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            messager.printMessage(ERROR, e.getMessage());
            return false;
        } catch (Exception e) {
            messager.printMessage(ERROR, e.getMessage());
            e.printStackTrace();
            return false;
        }
        return result;
    }

    private String getQualifiedName(Class<?> clazz) {
        try {
            return clazz.getName();
        } catch (MirroredTypeException e) {
            return e.getTypeMirror().toString();
        }
    }

    private List<String> getQualifiedNames(Adapt adapt) {
        try {
            return Collections.singletonList(adapt.value()[0].getName());
        } catch (MirroredTypesException e) {
            return e.getTypeMirrors().stream().map(mirror -> mirror.toString()).collect(Collectors.toList());
        }
    }

    private String getQualifiedName(TypeElement clazz) {
        try {
            return clazz.getQualifiedName().toString();
        } catch (MirroredTypeException e) {
            return e.getTypeMirror().toString();
        }
    }

    protected String simpleName(String name) {
        String[] parts = name.split("\\.");
        return parts[parts.length - 1];
    }

    protected String factoryName(String name) {
        String[] parts = name.split("\\.");
        return parts[parts.length - 1] + suffix;
    }

    protected String toSafeName(String name) {
        return name.replace('.', '_');
    }

}
