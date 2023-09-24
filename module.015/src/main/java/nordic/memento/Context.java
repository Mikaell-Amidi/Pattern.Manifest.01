package nordic.memento;

import java.util.List;

public class Context<T> {

    public Context(List<Memento<T>> mementos) {
        this.mementos = mementos;
    }

    public void addMemento(Memento<T> memento) {
        mementos.add(memento);
    }

    public Memento<T> getMemento(int index) {
        return mementos.get(index);
    }

    private final List<Memento<T>> mementos;
}
