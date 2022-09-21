package com.nordic.visitor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@FunctionalInterface
public interface Visitor<R> {

    R visit(Object o);

    static <T, R> X<T, R> forType(Class<T> type) {
        return () -> type;
    }

    static <R> Visitor<R> of(VisitorConsumer<VisitorBuilder<R>> visitorConsumer) {
        Map<Class<?>, Function<Object, R>> registry = new HashMap<>();
        VisitorBuilder<R> visitorBuilder = new VisitorBuilder<R>() {
            @Override
            public <T> void register(Class<T> type, Function<T, R> function) {
                registry.put(type, function.compose(type::cast));
            }
        };
        visitorConsumer.accept(visitorBuilder);
        return o -> (R) registry.get(o.getClass()).apply(o);
    }

    interface X<T, R> {
        default Y<R> execute(Function<T, R> function) {
            return visitorBuilder -> visitorBuilder.register(type(), function);
        }

        Class<T> type();
    }

    interface Y<R> extends VisitorConsumer<VisitorBuilder<R>> {
        default <T> W<T, R> forType(Class<T> type) {
            return index -> index == 0 ? this : type;
        }

        default Y<R> andThen(Y<R> after) {
            return t -> {
                this.accept(t);
                after.accept(t);
            };
        }
    }

    interface W<T, R> {

        Object get(int index);

        default Class<T> type() {
            return (Class<T>) get(1);
        }

        default Y<R> previousConsumer() {
            return (Y<R>) get(0);
        }

        default Y<R> execute(Function<T, R> function) {
            return previousConsumer().andThen(visitorBuilder -> visitorBuilder.register(type(), function));
        }
    }
}
