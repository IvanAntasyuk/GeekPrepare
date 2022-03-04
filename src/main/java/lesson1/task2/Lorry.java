package lesson1.task2;

class Lorry  { ///class Lorry extends Car implements   Moveable, Stopable
    // отсутствует конструктор
    public void move(){
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("Car is stop");
    }

    // должен имплиментить метод open();
}
