package com.nordic.impementation;

import com.nordic.strategy.Strategy;
import com.nordic.strategy.StrategyContext;

public class Main {
    public static void main(String[] args) {
        StrategyContext<String> vehicleContext = new Boat();
        StrategyContext<String> secondVehicleContext = new Aeroplane();
        Strategy<String> failOver = () -> null;

        System.out.println(secondVehicleContext.activate());
        System.out.println(vehicleContext.activate());
        System.out.println(failOver.failure(() -> "the failover strategy strategy ").trigger());

    }
}
