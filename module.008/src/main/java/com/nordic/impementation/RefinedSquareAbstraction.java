package com.nordic.impementation;

import com.nordic.bridge.Abstraction;
import com.nordic.bridge.Implementor;

public class RefinedSquareAbstraction extends Abstraction<String> {

    public RefinedSquareAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public String draw() {
        return "the " + implementor.execute() + " square";
    }
}
