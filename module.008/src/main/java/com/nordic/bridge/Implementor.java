package com.nordic.bridge;

@FunctionalInterface
public interface Implementor {
    <R> R execute();
}
