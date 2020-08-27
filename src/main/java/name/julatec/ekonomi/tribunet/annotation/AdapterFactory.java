package name.julatec.ekonomi.tribunet.annotation;

/**
 * Provides adaption support for the classes defined by {@link Adapt}.
 */
public interface AdapterFactory {

    Class<?>[] supportedClasses();

    <T> T adapt(Object target);
}
