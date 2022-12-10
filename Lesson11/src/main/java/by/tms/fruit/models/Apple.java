package by.tms.fruit.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Apple extends Fruit {
    private int price = 5;

    public Apple(int weight) {
        super(weight);
    }

    public int sumApple() {
        return getPrice() * getWeight();
    }

    @Override
    public void fruitPrice(int weight) {
        System.out.println("Стоимость " + getWeight() + " кг. равна " + sumApple());
    }
}
