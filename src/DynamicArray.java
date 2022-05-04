import java.util.Arrays;

public class DynamicArray {
    private int size;
    private Object[] data;

    public DynamicArray() {
        this(20);
    }

    public DynamicArray(int initialCapacity) {
        data = new Object[initialCapacity];
        size = 0;
    }

    public void add(Object value) {
        if (size >= data.length) {
            data = grow(data);
        }
        data[size++] = value;
    }

    private static Object[] grow(Object[] oldArray) {

        return Arrays.copyOf(oldArray, oldArray.length * 2);
    }

    @Override
    public String toString() {
        return Arrays.toString(data) ;
    }
}
