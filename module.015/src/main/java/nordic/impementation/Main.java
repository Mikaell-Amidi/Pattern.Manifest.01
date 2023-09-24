package nordic.impementation;

import nordic.memento.Context;
import nordic.memento.Originator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Context<String> context = new Context<>(new ArrayList<>());
        Originator<String> originator = new Originator<>();

        originator.setState("State 1");
        context.addMemento(originator.saveStateToMemento());

        originator.setState("State 2");
        context.addMemento(originator.saveStateToMemento());

        originator.setState("State 3");
        context.addMemento(originator.saveStateToMemento());

        originator.restoreStateFromMemento(context.getMemento(0));
        System.out.println("Current state: " + originator.getState());

        originator.restoreStateFromMemento(context.getMemento(1));
        System.out.println("Current state: " + originator.getState());

        originator.restoreStateFromMemento(context.getMemento(2));
        System.out.println("Current state: " + originator.getState());
    }
}
