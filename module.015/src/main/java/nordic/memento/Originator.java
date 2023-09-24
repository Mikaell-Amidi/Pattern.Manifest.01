package nordic.memento;

public class Originator<T> {

    public void setState(T state) {
        this.state = state;
    }

    public T getState() {
        return state;
    }

    public Memento<T> saveStateToMemento() {
        return new Memento<>(state);
    }

    public void restoreStateFromMemento(Memento<T> memento) {
        state = memento.extractState();
    }

    private T state;
}
