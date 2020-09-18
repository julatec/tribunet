@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Adapt {
    Class<?>[] value();
}