package nordic.impementation;

public class Triangle {

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateAreaOfTriangle() {
        return 0.5 * base * height;
    }

    public final double base;

    public final double height;
}
