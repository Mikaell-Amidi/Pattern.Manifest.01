package com.nordic.impementation;

import com.nordic.strategy.Strategy;
import com.nordic.strategy.StrategyContext;

public class Main {
    public static void main(String[] args) {
        StrategyContext<String> vehicleContext = new Boat(String::new);
        StrategyContext<String> secondVehicleContext = new Aeroplane(String::new);
        Strategy<String> failOver = r -> System.out.println("the failed strategy" + r);

        vehicleContext.activate();
        secondVehicleContext.activate();

        failOver.and(r -> System.out.println("the great failure" + r)).trigger("mike");

    }
}
