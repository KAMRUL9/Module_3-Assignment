package Inheritance;

public class Main {

	public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8, 5);
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(5);
        System.out.println("Square:");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}