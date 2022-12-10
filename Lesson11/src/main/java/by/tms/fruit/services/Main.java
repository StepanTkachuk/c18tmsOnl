package by.tms.fruit.services;

import by.tms.fruit.models.Apple;
import by.tms.fruit.models.Apricot;
import by.tms.fruit.models.Pear;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(10);
        apple.fruitPrice(10);
        Apricot apricot = new Apricot(5);
        apricot.fruitPrice(5);
        Pear pear = new Pear(7);
        pear.fruitPrice(7);
        int allSum = apple.sumApple() + apricot.sumApricot() + pear.sumPear();
        System.out.println(allSum);
    }
}
