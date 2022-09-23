package nordic.impementation;

import nordic.iterator.IterateDirector;

public class Main {
    public static void main(String[] args) {
        IterateDirector<String> artInspector = new Art().director();
        IterateDirector<Integer> scienceInspector = new Science().director();
        while (artInspector.hasNext()) {
            System.out.println(artInspector.next());
        }
        while (scienceInspector.hasNext()) {
            System.out.println(scienceInspector.next());
        }
    }
}
