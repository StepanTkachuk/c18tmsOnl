import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskDop1 {
    public static void main(String[] args) {
        printArray();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку, что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int arraySize;
        do {
            System.out.println("Введите положительное число");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число");
                scanner.next();
            }
            arraySize = scanner.nextInt();
        } while (arraySize < 0);
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
