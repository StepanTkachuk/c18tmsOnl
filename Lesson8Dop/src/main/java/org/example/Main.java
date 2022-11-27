package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int, double, flout, boolean, char, long, short, byte
        long value = 5;
        short value1 = 1;
        long l = value1 * value;
        byte b = 1;
        byte b1 = 1;
        int i1 = b1 * b;
     /*   Создайте и заполните массив случайным числами и выведете
        максимальное, минимальное и среднее
         значение.
                Для генерации случайного числа используйте метод Math.random().
                Пусть будет возможность создавать массив произвольного размера.
        Пусть размер массива вводится с консоли.*/
        Scanner scanner = new Scanner(System.in);
        int maxValue;
        int minValue;
        double mediumValue;
        double summ = 0;
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            summ += array[i];
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        minValue = array[0];
        maxValue = array[array.length - 1];
        mediumValue = summ / array.length;
        System.out.println(minValue);
        System.out.println(maxValue);
        System.out.println(mediumValue);

    }
}