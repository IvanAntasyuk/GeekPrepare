package lesson1.task2;

class LightWeightCar extends Car implements Moveable {
    // отсутствует конструктор
    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
