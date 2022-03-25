package com.nordic.bridge;

public abstract class Abstraction<R> {
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    abstract public R draw();

    protected Implementor implementor;
}
