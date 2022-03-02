package com.nordic.visitor;



import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Supplier;

@FunctionalInterface
public interface VisitorConsumer<T> {

    void accept(T t);

    default VisitorConsumer<T> chainConsumer(VisitorConsumer<T> other) {
        Objects.requireNonNull(other);
        return (T t) -> {
            this.accept(t);
            other.accept(t);
        };
    }

    default <U> Z<U> construct(Class<?> type) {
        return () -> type;
    }

    interface Z<U> {
        default <U> U build(VisitorConsumer<U> consumer, Supplier<U> supplier) {

            BiFunction<VisitorConsumer<U>, Supplier<U>, U> extractor = (o, s) -> {
                U u = s.get();
                o.accept(u);
                return u;
            };
            return extractor.apply(consumer, supplier);
        }

        Class<?> type();
    }


}
