package com.nordic.impementation;

import com.nordic.csf.ConditionalStrategyFactory;
import com.nordic.csf.Handler;

public class Main {
    public static void main(String[] args) {
        ConditionalStrategyFactory<String> commandFactory = new ConditionalStrategyFactory<>();
        commandFactory.setStrategy("first", new Handler<>(System.out::println));
        commandFactory.setStrategy("second", new Handler<>(PartType::extract));
        commandFactory.getStrategy("first").orElseThrow(RuntimeException::new).apply(1);
    }
}
