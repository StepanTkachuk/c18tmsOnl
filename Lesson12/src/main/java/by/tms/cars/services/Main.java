package by.tms.cars.services;

import by.tms.cars.models.Cars;

public class Main {
    public static void main(String[] args) {
        Cars cars1 = new Cars("Honda", 215, 15000);
        Cars cars2 = new Cars("Opel", 202, 4000);
        Cars cars3 = new Cars("Nissan", 210, 15000);
        cars1.start();
        cars2.start();
        cars3.start();
    }
}
