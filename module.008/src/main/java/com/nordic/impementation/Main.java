package com.nordic.impementation;

import com.nordic.bridge.Implementor;
import com.nordic.bridge.ConcreteImplementor;

public class Main {
    public static void main(String[] args) {

        Implementor implementor = new ConcreteImplementor<>(() -> "blue");
        RefinedSquareAbstraction blueSquare = new RefinedSquareAbstraction(implementor);
        Implementor secondImplementor = new ConcreteImplementor<>(() -> "red");
        RefinedSquareAbstraction redSquare = new RefinedSquareAbstraction(secondImplementor);
        System.out.println(blueSquare.draw());
        System.out.println(redSquare.draw());

    }
}
