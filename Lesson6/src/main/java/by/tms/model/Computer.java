package by.tms.model;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Computer {
    public Computer(String cpu, String ram, String hdd, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    Scanner scanner = new Scanner(System.in);
    private String cpu;
    private String ram;
    private String hdd;
    private int resource;
    private boolean burned; //true - сгорел, false - не сгорел

    public String description() {
        return cpu + " " + ram + " " + hdd + " " + resource;
    }

    public void onOrOff() {
        if (resource <= 0 || burned) {
            System.out.println("Компьютер сгорел");
        } else {
            System.out.println("Выберите действие on или off");
            if (Objects.equals(scanner.nextLine(), "on")) {
                on();
            } else if (Objects.equals(scanner.nextLine(), "off")) {
                off();
            }
        }
    }

    public void on() {
        int value;
        if (!burned) {
            System.out.println("Внимание! Введите 0 или 1");
            Random random = new Random();
            value = random.nextInt(2);
            if (scanner.nextInt() == value) {
                System.out.println("Компьютер выключился");
                onOrOff();
            } else {
                System.out.println("Компьютер сгорел");
                burned = true;
                onOrOff();
            }
        } else {
            System.out.println("Компьютер сгорел");
        }
    }

    public void off() {
        if (!burned) {
            System.out.println("Выключение компьютера");
            resource--;
        } else {
            System.out.println("Компьютер сгорел");
        }
    }
}