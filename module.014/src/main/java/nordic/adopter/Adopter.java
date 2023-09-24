package nordic.adopter;

import java.util.function.Function;

public abstract class Adopter<T, R> {

    public Adopter(Function<T, R> mapper) {
        this.mapper = mapper;
    }

    public R apply(T t) {
        return mapper.apply(t);
    }

    private final Function<T, R> mapper;
}
