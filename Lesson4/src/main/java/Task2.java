import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        evenSearch();
    }
    //2)Проверка четности числа.
    //Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
    // чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
    // Если пользователь введёт не целое число, то сообщать ему об ошибке.

    public static void evenSearch() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        try {
            int integer = Integer.parseInt(value);
            if (integer % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Введенное значение не является числом");
        }
    }
}
