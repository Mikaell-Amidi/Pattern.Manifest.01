package nordic.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDispatcher<T extends Command> extends Operand<T>{

    public CommandDispatcher() {
        super();
        this.commands = new ArrayList<>();
    }

    @Override
    public void operate() {
        commands.forEach(Command::execute);
    }

    @Override
    public CommandDispatcher<T> add(T t) {
        commands.add(t);
        return this;
    }

    @Override
    public CommandDispatcher<T> refresh() {
        this.commands.clear();
        return this;
    }


    private final List<T> commands;
}
