package nordic.impementation;

import nordic.iterator.Inspector;
import nordic.iterator.Inspect;

public class Art implements Inspect<String> {

    public Art() {
        papers = new String[]{"English", "History", "Geography", "Psychology"};
    }

    @Override
    public Inspector<String> inspector() {
        return new Inspector<>(papers);
    }

    private final String[] papers;
}
