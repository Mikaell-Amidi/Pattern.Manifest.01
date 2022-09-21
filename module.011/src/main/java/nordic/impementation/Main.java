package nordic.impementation;

import nordic.command.Command;
import nordic.command.CommandDispatcher;
import nordic.command.Operand;

public class Main {
    public static void main(String[] args) {
        Command undo = () -> System.out.println("undo command triggered");
        Command redo = () -> System.out.println("redo command triggered");
        Operand<Command> operation = new CommandDispatcher<>();
        operation.add(redo);
        operation.add(undo);
        operation.operate();
    }
}
