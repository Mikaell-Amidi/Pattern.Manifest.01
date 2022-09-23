package nordic.iterator;

@FunctionalInterface
public interface Inspect<E> {
    Inspector<E> inspector();
}
