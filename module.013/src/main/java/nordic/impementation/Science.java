package nordic.impementation;

import nordic.iterator.Inspector;
import nordic.iterator.Inspect;

public class Science implements Inspect<Integer> {

    public Science() {
        classNumbers = new Integer[]{101, 102, 103};
    }

    @Override
    public Inspector<Integer> inspector() {
        return new Inspector<>(classNumbers);
    }

    private final Integer[] classNumbers;
}
