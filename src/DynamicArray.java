import java.util.Arrays;

public class DynamicArray {
    private int size;
    private String[] data;

    public DynamicArray() {
        this(20);
    }

    public DynamicArray(int initialCapacity) {
        data = new String[initialCapacity];
        size = 0;
    }

    public void add(String value) {
        if (size >= data.length) {
            data = grow(data);
        }
        data[size++] = value;
    }

    private static String[] grow(String[] oldArray) {

        return Arrays.copyOf(oldArray, oldArray.length * 2);
    }

    @Override
    public String toString() {
        return Arrays.toString(data) ;
    }
}
