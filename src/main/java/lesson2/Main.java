package lesson2;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> array = new MyArrayList<>();
        array.addList(1);
        array.addList(2);
        array.addList(3);
        array.addList(4);
        array.addList(5);
        array.addList(6);
        array.addList(7);
        array.addList(8);
        array.addList(9);
        System.out.println(array);
        array.addList(11);
        System.out.println(array);
        array.removeList(1);
        System.out.println(array);
        System.out.println(array.isContains(9));

        MyList<Integer> list = new MyLinkedList<>();
        list.addList(1);
        list.addList(2);
        list.addList(3);
        list.addList(4);
        list.addList(5);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeList(2);

    }
}
