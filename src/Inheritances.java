//program to create a class called circle with a private instance variable radius.Provides public getter and setter methods for the radius, and a methods called calculateArea() and class calculatePerimeter() that return the area and perimeter of the circle respectively.
class circle {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius cannot be negative.");
        }
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Inheritances {
    public static void main(String[] args) {
        circle circle = new circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Testing setter with a negative value
        circle.setRadius(-3.0); // Should print an error message
    }
}