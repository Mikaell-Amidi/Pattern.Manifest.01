package nordic.impementation;


public class Rectangle {

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double calculateAreaOfRectangle() {
        return length * width;
    }

    public final double width;

    public final double length;
}
