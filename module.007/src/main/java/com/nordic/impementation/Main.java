package com.nordic.impementation;

import com.nordic.flyweight.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory<Color> factory = new FlyweightFactory<>(Car::new);
        factory.create(new Color("Red")).compute();
        factory.create(new Color("Black")).compute();
    }
}
