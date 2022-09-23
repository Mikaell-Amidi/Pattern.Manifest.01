package nordic.iterator;

@FunctionalInterface
public interface Iterate<E> {
    IterateDirector<E> director();
}
