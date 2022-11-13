import java.util.Arrays;
import java.util.Collections;

public class Task7 {
    public static void main(String[] args) {
        oddArray();
    }

    //        7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    public static void oddArray() {
        Integer[] array = new Integer[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("В обратном порядке");
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
