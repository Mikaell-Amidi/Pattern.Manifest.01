package nordic.impementation;

import nordic.adopter.Adopter;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.println("Calculate Rectangle Area : " +  rect.calculateAreaOfRectangle());
        Adopter<Rectangle, Triangle> adopter = new TriangleAdopter();
        System.out.println("Calculate Triangle Area : " +  adopter.apply(rect).calculateAreaOfTriangle());
    }
}
