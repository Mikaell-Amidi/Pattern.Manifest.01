package nordic.impementation;

import nordic.validator.Validator;

public class Main {
    public static void main(String[] args) {
        Validator<Milk> validator = Validator.validate(Milk::isHealthy, RuntimeException::new);
        validator.on(new Milk(false)).validate();
    }
}
