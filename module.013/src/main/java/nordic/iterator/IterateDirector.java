package nordic.iterator;

import java.util.Iterator;

public class IterateDirector<E> implements Iterator<E> {

    public IterateDirector(E[] elements) {
        this.index = 0;
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return elements.length > index;
    }

    @Override
    public E next() {
        return elements[index++];
    }

    public IterateDirector<E> first() {
        this.index = 0;
        return this;
    }

    public IterateDirector<E> index(int index) {
        this.index = index;
        return this;
    }

    public E currentItem() {
        return elements[index];
    }

    private int index;

    private final E[] elements;
}
