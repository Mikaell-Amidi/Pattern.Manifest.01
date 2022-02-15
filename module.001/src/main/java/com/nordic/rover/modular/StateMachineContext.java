package com.nordic.rover.modular;

import com.nordic.rover.modular.base.adopter.StateMachineObserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StateMachineContext {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StateMachineContext.class, args);
        context.getBean(StateMachineObserver.class).changeState();
    }

}
