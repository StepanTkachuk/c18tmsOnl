import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        lessModulo();
    }

    //3) Меньшее по модулю число.
    //Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
    // пользователем вещественных чисел с консоли.
    public static void lessModulo() {
        System.out.println("Введите три числа");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min < Math.abs(array[i])) {

            } else {
                min = array[i];
            }
        }
        System.out.println(min + " минимальное по модулю число");
    }
}
