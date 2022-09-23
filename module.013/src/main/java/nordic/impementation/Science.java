package nordic.impementation;

import nordic.iterator.IterateDirector;
import nordic.iterator.Iterate;

public class Science implements Iterate<Integer> {

    public Science() {
        classNumbers = new Integer[]{101, 102, 103};
    }

    @Override
    public IterateDirector<Integer> director() {
        return new IterateDirector<>(classNumbers);
    }

    private final Integer[] classNumbers;
}
