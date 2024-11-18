package ArrayList_java.util.ArrayList;

public class MyList<E> {
    private int size = 0 ;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException( "Index: " + index + " Size: " + size );
        }
        ensureCapacity(size+1);
        System.arraycopy(elements, index, elements, index+1, size-index);
        elements[index] = elements;
        size++;
    }

    public boolean add(E element) {

    }
}
