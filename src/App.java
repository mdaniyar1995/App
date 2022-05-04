import java.util.Arrays;
import java.util.S

public class App {
    public static void main(String[] args) {
        int capacity = 2;
        int size = 0;
        String[] toDoList = new String[capacity];
        Scanner sc = new Scanner(System.in);

        int choose = 3;
        do {
            System.out.println("1. Add item\n2. Show All\n3.Exit");
            choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("Enter new todo");
                sc.nextLine();
                if (size >= capacity) {
                    toDoList = growArray(toDoList);
                    capacity = toDoList.length;
                }
                toDoList[size++] = sc.nextLine();
            } else if (choose == 2) {
                System.out.println(Arrays.toString(toDoList));
            }
        } while (choose != 3);
    }
    public static String[] growArray(String[] oldArray) {

        return Arrays.copyOf(oldArray, oldArray.length*2);
    }
}
