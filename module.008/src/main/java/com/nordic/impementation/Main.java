package com.nordic.impementation;

import com.nordic.bridge.Implementor;
import com.nordic.bridge.ConcreteImplementor;

public class Main {
    public static void main(String[] args) {

        Implementor implementor = new ConcreteImplementor<>(() -> "blue");
        SquareAbstraction blueSquare = new SquareAbstraction(implementor);
        Implementor secondImplementor = new ConcreteImplementor<>(() -> "red");
        SquareAbstraction redSquare = new SquareAbstraction(secondImplementor);
        TriangleAbstraction redTriangle = new TriangleAbstraction(secondImplementor);
        System.out.println(blueSquare.draw());
        System.out.println(redSquare.draw());
        System.out.println(redTriangle.draw());

    }
}
