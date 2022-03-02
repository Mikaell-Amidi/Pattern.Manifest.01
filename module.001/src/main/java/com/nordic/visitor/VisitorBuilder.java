package com.nordic.visitor;


import java.util.function.Function;

public interface VisitorBuilder<R> {

    <T> void register(Class<T> type, Function<T, R> function);

}
