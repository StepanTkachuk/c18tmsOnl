package by.tms.fruit.models;

import lombok.Getter;

@Getter
public class Apricot extends Fruit {
    private int price = 10;

    public Apricot(int weight) {
        super(weight);
    }

    public int sumApricot() {
        return price * getWeight();
    }

    @Override
    public void fruitPrice(int weight) {
        System.out.println("Стоимость " + weight + " кг. равна " + sumApricot());
    }
}
