package lesson1.task3;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
       this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14 * radius * radius;

    }
}
