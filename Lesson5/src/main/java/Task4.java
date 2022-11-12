import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        zodiacSign();
    }
    //4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.

    public static void zodiacSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день рождения");
        int day = scanner.nextInt();
        System.out.println("Введите месяц рождения");
        int month = scanner.nextInt();
        switch ((int) month) {
            case (1) -> {
                if (day <= 20) {
                    System.out.println("Козерог");
                } else {
                    System.out.println("Водолей");
                }
            }
            case (2) -> {
                if (day <= 18) {
                    System.out.println("Водолей");
                } else {
                    System.out.println("Рыба");
                }
            }
            case (3) -> {
                if (day <= 20) {
                    System.out.println("Рыба");
                } else {
                    System.out.println("Овен");
                }
            }
            case (4) -> {
                if (day <= 20) {
                    System.out.println("Овен");
                } else {
                    System.out.println("Телец");
                }
            }
            case (5) -> {
                if (day <= 21) {
                    System.out.println("Телец");
                } else {
                    System.out.println("Близнецы");
                }
            }
            case (6) -> {
                if (day <= 21) {
                    System.out.println("Близнецы");
                } else {
                    System.out.println("Рак");
                }
            }
            case (7) -> {
                if (day <= 22) {
                    System.out.println("Рак");
                } else {
                    System.out.println("Лев");
                }
            }
            case (8) -> {
                if (day <= 23) {
                    System.out.println("Лев");
                } else {
                    System.out.println("Дева");
                }
            }
            case (9) -> {
                if (day <= 22) {
                    System.out.println("Дева");
                } else {
                    System.out.println("Весы");
                }
            }
            case (10) -> {
                if (day <= 23) {
                    System.out.println("Весы");
                } else {
                    System.out.println("Скорпион");
                }
            }
            case (11) -> {
                if (day <= 22) {
                    System.out.println("Скорпион");
                } else {
                    System.out.println("Стрелец");
                }
            }
            case (12) -> {
                if (day <= 21) {
                    System.out.println("Стрелец");
                } else {
                    System.out.println("Козерог");
                }
            }
        }
    }
}
