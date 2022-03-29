package com.nordic.impementation;

import com.nordic.strategy.StrategyContext;

public class Boat extends StrategyContext<String> {

    public Boat() {
        super(() -> "i should drive in water");
    }
}
