package com.nordic.bridge;

import java.util.function.Supplier;

public class ConcreteImplementor<R> implements Implementor {

    public ConcreteImplementor(Supplier<R> supplier) {
        this.supplier = supplier;
    }

    @Override
    public R execute() {
        return supplier.get();
    }

    private final Supplier<R> supplier;
}
