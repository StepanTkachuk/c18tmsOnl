package org.example;

import java.lang.reflect.Array;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Введите числа через пробел");
        Scanner console = new Scanner(System.in);
        String[] str = console.nextLine().split(" ");
        for (String s : str) {
            try {
                int i = Integer.parseInt(s);
                if (i > 0) {
                    count++;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Некоректный символ был проигнорирован");
            }
        }
        System.out.println("Количество чисел больше нуля = " + count);
    }

}