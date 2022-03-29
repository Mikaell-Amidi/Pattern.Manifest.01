package com.nordic.impementation;

import com.nordic.bridge.Abstraction;
import com.nordic.bridge.Implementor;

public class SquareAbstraction extends Abstraction<String> {

    public SquareAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public String draw() {
        return "the " + implementor.execute() + " square";
    }
}
