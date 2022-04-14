package com.nordic.flyweight;

@FunctionalInterface
public interface Flyweight<R> {
    R compute();
}
