package lesson1.task3;

public class Square extends Shape {
    private double sideOne;
    private double sideTwo;

    public Square(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    double getArea() {
        return sideOne * sideTwo;
    }
}
