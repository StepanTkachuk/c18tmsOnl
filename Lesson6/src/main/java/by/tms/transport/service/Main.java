package by.tms.transport.service;

import by.tms.transport.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Процессор", "Оперативная память", "Жесткий диск", 10);
        computer.onOrOff();
    }
}
