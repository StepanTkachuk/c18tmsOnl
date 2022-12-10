package by.tms.fruit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public abstract class Fruit {
    private int weight;

    private void printManufacturerInfo() {
        System.out.println("Made in Belarus");
    }

    abstract void fruitPrice(int weight);
}
