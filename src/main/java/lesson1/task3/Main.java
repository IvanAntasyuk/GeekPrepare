package lesson1.task3;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(23.1);
        Shape rect = new Rectangle(12,10);
        Shape square = new Square(7,7);
        System.out.println("Area circle : " + circle);
        System.out.println("Area rectangle : " + rect);
        System.out.println("Area square : " + square);
    }
}
