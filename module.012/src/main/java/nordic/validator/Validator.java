package nordic.validator;


import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
public interface Validator<T> {

    ValidatorSupplier<?> on(T t);

    default <E extends RuntimeException> Validator<T> thenValidate(Predicate<T> predicate, Supplier<E> supplier) {
        return p -> predicate.test(p) ? () -> p : () -> {
            throw supplier.get();
        };
    }

    static <T, E extends RuntimeException> Validator<T> validate(Predicate<T> predicate, Supplier<E> supplier) {
        return p -> predicate.test(p) ? () -> p : () -> {
            throw supplier.get();
        };
    }

    interface ValidatorSupplier<T> extends Supplier<T> {
        default T validate() {
            return get();
        }
    }
}
