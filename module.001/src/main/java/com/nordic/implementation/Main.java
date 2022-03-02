package com.nordic.implementation;

import com.nordic.visitor.Visitor;
import com.nordic.visitor.VisitorBuilder;
import com.nordic.visitor.VisitorConsumer;

public class Main {
    public static void main(String[] args) {
        VisitorConsumer<VisitorBuilder<String>> consumer = Visitor.<Beta, String>forType(Beta.class)
                .execute(o -> "The Great : " + o.getName())
                .forType(Alpha.class).execute(Alpha::getName);

        Visitor<String> visitor = Visitor.of(consumer);
        System.out.println(visitor.visit(new Beta("Wolf")));
        System.out.println(visitor.visit(new Alpha("Wolf")));
    }
}
