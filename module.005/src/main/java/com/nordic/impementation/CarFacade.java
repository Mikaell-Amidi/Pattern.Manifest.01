package com.nordic.impementation;

import com.nordic.facade.Facade;

public class CarFacade extends Facade<CarFacade> {

    @Override
    public CarFacade start() {
        Engine engine = new Engine();
        Temperature temperature = new Temperature();
        engine.startEngine();
        temperature.calculateTemperature();
        return this;
    }
}
