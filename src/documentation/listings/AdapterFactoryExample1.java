public interface AdapterFactory {
    Class<?>[] supportedClasses();
    <T> T adapt(Object target);
}
