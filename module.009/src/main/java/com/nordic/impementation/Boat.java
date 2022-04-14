package com.nordic.impementation;

import com.nordic.strategy.Strategy;
import com.nordic.strategy.StrategyContext;

import java.util.function.Supplier;

public class Boat extends StrategyContext<String> {

    public Boat(Supplier<String> supplier) {
        super(r -> System.out.println("Test"), supplier);
    }
}
