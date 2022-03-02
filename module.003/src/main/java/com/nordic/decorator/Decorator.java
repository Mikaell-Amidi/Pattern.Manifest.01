package com.nordic.decorator;


import java.util.Objects;
import java.util.function.Supplier;

public abstract class Decorator<T> {
    private T t;

    public void setTheKernel(Supplier<? extends T> supplier) {
        this.t = supplier.get();
    }

    public T decorate() {
        return Objects.isNull(t) ? null : this.t;
    }

}
