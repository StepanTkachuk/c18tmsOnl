package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Введите набор чисел через пробел");
        System.out.println("Хммммм, давай-ка узнаем сколько здесь положетельных чисел");
        Scanner scan = new Scanner(System.in);
        String[] arg = scan.nextLine().split(" ");
        for (String s : arg) {
            int i = Integer.parseInt (s);
            if (i > 0) {
                count++;
            }
        }
        System.out.println(count);


    }
}