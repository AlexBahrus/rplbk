// Superclass: Shape
abstract class Shape {
    public abstract double getArea();
}

// Subclass: Rectangle
class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

// Subclass: Square
class Square extends Shape {
    protected double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

// Class to calculate total area (respects LSP)
class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.getArea();
    }
}

public class LSPExample {
    public static void main(String[] args) {
        // Menggunakan objek Rectangle
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        // Menggunakan objek Square
        Shape square = new Square(7);
        System.out.println("Area of Square: " + square.getArea());

        // Menggunakan objek dengan AreaCalculator
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total Area (Rectangle): " + calculator.calculateArea(rectangle));
        System.out.println("Total Area (Square): " + calculator.calculateArea(square));
    }
}
