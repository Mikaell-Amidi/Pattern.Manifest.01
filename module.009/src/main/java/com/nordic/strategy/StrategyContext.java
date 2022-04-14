package com.nordic.strategy;

import java.util.function.Supplier;

public abstract class StrategyContext<R> {

    public StrategyContext(Strategy<R> strategy, Supplier<? extends R> supplier) {
        this.r = supplier.get();
        this.strategy = strategy;
    }

    public void activate() {
        strategy.trigger(this.r);
    }

    private final R r;

    private final Strategy<R> strategy;
}
