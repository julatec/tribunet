package name.julatec.ekonomi.tribunet.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines the list of classes to adapt to the target interface.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Adapt {
    /**
     * List of target classes to adapt.
     *
     * @return target classes.
     */
    Class<?>[] value();
}
