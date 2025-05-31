class Shape {
    public double getPerimeter() {
        return 0.0; // Default implementation, can be overridden
    }
    public double getArea() {
        return 0.0; // Default implementation, can be overridden
    }

}
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(5.0);
        System.out.println("Perimeter of Circle: " + shape.getPerimeter());
        System.out.println("Area of Circle: " + shape.getArea());
    }
}