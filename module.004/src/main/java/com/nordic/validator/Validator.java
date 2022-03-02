package com.nordic.validator;


import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
public interface Validator<T> {

    Supplier<?> on(T t);

    default Validator<T> thenValidate(Predicate<T> predicate) {
        return p -> predicate.test(p) ? () -> p : RuntimeException::new;
    }

    static <T> Validator<T> validate(Predicate<T> predicate) {
        return p -> predicate.test(p) ? () -> p : RuntimeException::new;

    }

}
