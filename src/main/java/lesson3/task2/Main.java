package lesson3.task2;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(150, 1);
        Thread threadOne = new Thread(() -> {
            try {
                while (true) {
                    counter.countUp();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread threadTwo = new Thread(() -> {
            try {
                while (true) {
                    counter.countUp();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadOne.start();
        threadTwo.start();

    }
}
