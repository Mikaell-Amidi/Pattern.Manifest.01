package com.nordic.strategy;

import java.io.Serializable;
import java.util.Objects;

@FunctionalInterface
public interface Strategy<R> {
    R trigger();


    default Strategy<R> failure(Strategy<? extends R> other) {
        Objects.requireNonNull(other);

        return (Strategy<R> & Serializable) () -> {
            R res = this.trigger();
            return Objects.nonNull(res) ? res :  other.trigger();
        };
    }
}
