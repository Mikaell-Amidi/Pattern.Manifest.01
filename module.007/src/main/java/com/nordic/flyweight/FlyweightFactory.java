package com.nordic.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FlyweightFactory<R> {

    public FlyweightFactory(Function<R, Flyweight<R>> supplier) {
        this.function = supplier;
    }

    public Flyweight<R> create(R r) {
        return cache.computeIfAbsent(r, function);
    }

    private final Map<R, Flyweight<R>> cache = new HashMap<>();

    private final Function<R, Flyweight<R>> function;
}
