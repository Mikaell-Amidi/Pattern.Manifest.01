package nordic.template;

public abstract class Template<R> {

    public final void execute() {
        this.template();
    }

    public abstract void template();

}
