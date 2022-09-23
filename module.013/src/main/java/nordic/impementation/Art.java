package nordic.impementation;

import nordic.iterator.IterateDirector;
import nordic.iterator.Iterate;

public class Art implements Iterate<String> {

    public Art() {
        papers = new String[]{"English", "History", "Geography", "Psychology"};
    }

    @Override
    public IterateDirector<String> director() {
        return new IterateDirector<>(papers);
    }

    private final String[] papers;
}
