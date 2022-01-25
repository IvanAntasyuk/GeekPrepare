package lesson2;

public interface MyList<E> {
    void addList(E e);

    void removeList(E e);

    void removeByIndex(int i);

    E getItemFromListById(int i);

    boolean isContains(E e);

    E getLast();

    E getFirst();
}
