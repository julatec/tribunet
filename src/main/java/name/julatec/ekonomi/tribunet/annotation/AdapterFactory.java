package name.julatec.ekonomi.tribunet.annotation;

/**
 * Provides adaption support for the classes defined by {@link Adapt}.
 */
public interface AdapterFactory {

    /**
     * Classes to be adapted.
     * @return supported classes.
     */
    Class<?>[] supportedClasses();

    /**
     * Adapts the given object if is assignable from one of the supported classes.
     * @param target target object to be adapted
     * @param <T> Target adaptee class.
     * @return facade object adapts the given object to the target interface T.
     */
    <T> T adapt(Object target);
}
