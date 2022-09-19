package nordic.impementation;

import nordic.template.Template;

public class Main {
    public static void main(String[] args) {
        Template algorithmOne = new Alpha();
        Template algorithmTwo = new Beta();
        algorithmOne.execute();
        algorithmTwo.execute();
    }
}
