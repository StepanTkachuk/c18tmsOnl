package by.tms.model;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Computer {
    public Computer(String cpu, String ram, String hdd, int resource, boolean condition) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
        this.condition = condition;
    }

    String cpu;
    String ram;
    String hdd;
    int resource;
    boolean condition; //true - рабочий, false - сгорел

    public String description() {
        return cpu + " " + ram + " " + hdd + " " + resource;
    }

    public void onOrOff() {
        if (resource <= 0) {
            System.out.println("Компьютер сгорел");
        } else {
            System.out.println("Выберите действие on или off");
            Scanner scanner = new Scanner(System.in);
            if (Objects.equals(scanner.nextLine(), "on")) {
                on();
            } else if (Objects.equals(scanner.nextLine(), "off")) {
                off();
            }
        }
    }

    public void on() {
        int value;
        Scanner scanner = new Scanner(System.in);
        if (condition) {
            System.out.println("Внимание! Введите 0 или 1");
            Random random = new Random();
            value = random.nextInt(2);
            if (scanner.nextInt() == value) {
                System.out.println("Компьютер выключился");
                onOrOff();
            } else {
                System.out.println("Компьютер сгорел");
                condition = false;
                onOrOff();
            }
        } else {
            System.out.println("Компьютер сгорел");
        }
    }

    public void off() {
        if (condition) {
            System.out.println("Выключение компьютера");
            resource--;
        } else {
            System.out.println("Компьютер сгорел");
        }
    }
}