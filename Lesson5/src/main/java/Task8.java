import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        maxElementInArray();
    }

    //        8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
    public static void maxElementInArray() {
        Random random = new Random();
        int[] array = new int[12];
        int max = array[0];
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
            if (array[i] >= max) {
                max = array[i];
                indexMax = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальный элемент " + max);
        System.out.println("Индекс его последнего вхождения в массив = " + indexMax);
    }
}
