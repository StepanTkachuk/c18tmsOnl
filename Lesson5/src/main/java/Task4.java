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
        if (month > 0 && month < 13) {
            switch ((int) month) {
                case (1) -> {
                    if (day <= 20 && day > 0) {
                        System.out.println("Козерог");
                    } else if (day <= 31) {
                        System.out.println("Водолей");
                    } else {
                        System.out.println("Введено некорректное значение");
                    }
                }
                case (2) -> {
                    if (day <= 18 && day > 0) {
                        System.out.println("Водолей");
                    } else if (day <= 28) {
                        System.out.println("Рыба");
                    } else {
                        System.out.println("Введено некорректное значение");
                    }
                }
                case (3) -> {
                    if (day <= 20 && day > 0) {
                        System.out.println("Рыба");
                    } else if (day <= 31) {
                        System.out.println("Овен");
                    } else {
                        System.out.println("Введено некорректное значение");
                    }
                }
                case (4) -> {
                    if (day <= 20 && day > 0) {
                        System.out.println("Овен");
                    } else if (day <= 30) {
                        System.out.println("Телец");
                    } else {
                        System.out.println("Введено некорректное значение");
                    }
                }
                case (5) -> {
                    if (day <= 21 && day > 0) {
                        System.out.println("Телец");
                    } else if (day <= 31) {
                        System.out.println("Близнецы");
                    }
                }
                case (6) -> {
                    if (day <= 21 && day > 0) {
                        System.out.println("Близнецы");
                    } else if (day <= 30) {
                        System.out.println("Рак");
                    } else {
                        System.out.println("Введено некорректное значение");
                    }
                }
                case (7) -> {
                    if (day <= 22 && day > 0) {
                        System.out.println("Рак");
                    } else if (day <= 31) {
                        System.out.println("Лев");
                    } else {
                        System.out.println("Введено некорректное значение");
                    }
                }
                case (8) -> {
                    if (day <= 23 && day > 0) {
                        System.out.println("Лев");
                    } else if (day <= 31) {
                        System.out.println("Дева");
                    } else {
                        System.out.println("Введено некорректное значение");
                    }
                }
                case (9) -> {
                    if (day <= 22 && day > 0) {
                        System.out.println("Дева");
                    } else if (day <= 30) {
                        System.out.println("Весы");
                    } else {
                        System.out.println("Введено некорректное значение");
                    }
                }
                case (10) -> {
                    if (day <= 23 && day > 0) {
                        System.out.println("Весы");
                    } else if (day <= 31) {
                        System.out.println("Скорпион");
                    } else {
                        System.out.println("Введено некорректное значение");
                    }
                }
                case (11) -> {
                    if (day <= 22 && day > 0) {
                        System.out.println("Скорпион");
                    } else if (day <= 30) {
                        System.out.println("Стрелец");
                    } else {
                        System.out.println("Введено некорректное значение");
                    }
                }
                case (12) -> {
                    if (day <= 21 && day > 0) {
                        System.out.println("Стрелец");
                    } else if (day <= 31) {
                        System.out.println("Козерог");
                    } else {
                        System.out.println("Введено некорректное значение");
                    }
                }
            }
        }
    }
}
