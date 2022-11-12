import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        oddArray();
    }

    //        7) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    public static void oddArray() {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("В обратном порядке");
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            array[j] = array[i]; //доходит то точки пересечения и потом увеличивает значения. Разобраться!!!
        }
        System.out.println(Arrays.toString(array));
    }
}
