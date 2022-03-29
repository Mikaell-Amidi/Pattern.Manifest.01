package com.nordic.impementation;

import com.nordic.bridge.Abstraction;
import com.nordic.bridge.Implementor;

public class TriangleAbstraction extends Abstraction<String> {
    public TriangleAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public String draw() {
        return "the " + implementor.execute() + " triangle";
    }
}
