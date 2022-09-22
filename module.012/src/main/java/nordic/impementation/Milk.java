package nordic.impementation;


public class Milk {

    public Milk(Boolean healthy) {
        this.healthy = healthy;
    }

    public Boolean isHealthy() {
        return healthy;
    }

    private final Boolean healthy;
}
