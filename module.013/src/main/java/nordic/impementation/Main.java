package nordic.impementation;

import nordic.iterator.Inspector;

public class Main {
    public static void main(String[] args) {
        Inspector<String> artInspector = new Art().inspector();
        Inspector<Integer> scienceInspector = new Science().inspector();
        while (artInspector.hasNext()) {
            System.out.println(artInspector.next());
        }
        while (scienceInspector.hasNext()) {
            System.out.println(scienceInspector.next());
        }
    }
}
