package by.tms.fruit.models;

import lombok.Getter;

@Getter

public class Pear extends Fruit {
    private int price = 7;

    public Pear(int weight) {
        super(weight);
    }

    public int sumPear() {
        return price * getWeight();
    }

    @Override
    public void fruitPrice(int weight) {
        System.out.println("Стоимость " + weight + " кг. равна " + sumPear());
    }
}
