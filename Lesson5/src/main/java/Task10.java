import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        arrayMaxElement();
    }

    //        10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    public static void arrayMaxElement() {
        int[] array = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = max;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
