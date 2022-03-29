package com.nordic.strategy;

public abstract class StrategyContext<R> {

    public StrategyContext(Strategy<R> strategy) {
        this.strategy = strategy;
    }

    public R activate(){
        return strategy.trigger();
    }

    private final Strategy<R> strategy;
}
