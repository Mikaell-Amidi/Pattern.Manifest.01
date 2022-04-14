package com.nordic.strategy;

import java.io.Serializable;
import java.util.Objects;


@FunctionalInterface
public interface Strategy<R> {

    void trigger(R r);

    default Strategy<R> and(Strategy<? super R> after) {
        Objects.requireNonNull(after);
        return (Strategy<R> & Serializable) (R r) -> {
            trigger(r);
            after.trigger(r);
        };
    }
}
