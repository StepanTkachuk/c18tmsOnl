import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        array0array();
    }

    //        9) Создайте массив размера 20, заполните его случайными целыми числами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
    public static void array0array() {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {

            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
