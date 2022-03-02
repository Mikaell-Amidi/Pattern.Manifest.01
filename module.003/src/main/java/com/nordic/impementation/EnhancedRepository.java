package com.nordic.impementation;

import com.nordic.decorator.Decorator;

public class EnhancedRepository<T> extends Decorator<T> {
    public void enhancedSave() {
        System.out.println("enhanced save activated");
    }
}
