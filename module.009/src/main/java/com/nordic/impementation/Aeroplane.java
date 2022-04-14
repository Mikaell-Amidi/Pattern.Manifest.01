package com.nordic.impementation;


import com.nordic.strategy.StrategyContext;

import java.util.function.Supplier;

public class Aeroplane extends StrategyContext<String> {

    public Aeroplane(Supplier<String> supplier) {
        super(r -> System.out.println("second test"), supplier);
    }
}
