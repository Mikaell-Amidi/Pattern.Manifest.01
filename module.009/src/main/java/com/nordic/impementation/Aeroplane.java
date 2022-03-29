package com.nordic.impementation;

import com.nordic.strategy.StrategyContext;

public class Aeroplane extends StrategyContext<String> {

    public Aeroplane() {
        super(() -> "i should drive in air");
    }
}
