package com.nordic.csf;

import java.util.function.Consumer;

public class Handler<T> extends Strategy {
    private final Consumer<T> consumer;

    public Handler(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void apply(Object o) {
        consumer.accept((T) o);
    }
}
