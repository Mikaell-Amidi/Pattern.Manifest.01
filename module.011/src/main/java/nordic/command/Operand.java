package nordic.command;

public abstract class Operand<T extends Command> {

    public abstract void operate();

    public abstract Operand<T> add(T t);

    public abstract Operand<T> refresh();

}
