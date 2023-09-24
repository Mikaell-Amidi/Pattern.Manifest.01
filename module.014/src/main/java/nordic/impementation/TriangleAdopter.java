package nordic.impementation;

import nordic.adopter.Adopter;

public class TriangleAdopter extends Adopter<Rectangle, Triangle> {

    public TriangleAdopter() {
        super(rectangle -> new Triangle(rectangle.length, rectangle.width));
    }
}
