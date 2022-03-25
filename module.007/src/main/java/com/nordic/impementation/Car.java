package com.nordic.impementation;

import com.nordic.flyweight.Flyweight;

public class Car implements Flyweight<Color> {

    private Color color;

    public Car(Color color) {
        this.color = color;
    }

    @Override
    public Color compute() {
        System.out.println(this.color.getColorName());
        return this.color;
    }
}
