package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Процессор", "Оперативная память", "Жесткий диск", 10);
        computer.onOrOff();
    }
}
