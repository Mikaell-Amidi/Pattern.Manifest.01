package nordic.memento;

public class Memento<T> {

    public Memento(T state) {
        this.state = state;
    }

    public T extractState() {
        return state;
    }

    private final T state;
}
