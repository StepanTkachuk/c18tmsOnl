import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        numberParsing();
    }

    //3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, введите число: 5
//        "5 - это положительное число, количество цифр = 1"
    public static void numberParsing() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int num = (int) Math.log10(Math.abs(value)) + 1;
        if (value > 0) {
            System.out.println(value + " это положительное число" + " количество цифр = " + num);
        } else if (value < 0) {
            System.out.println(value + " это отрицательное число" + " количество цифр = " + num);
        } else {
            System.out.println("Это ноль , количество цифр 1");
        }
    }
}