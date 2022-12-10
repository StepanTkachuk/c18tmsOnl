package by.tms.clothes.models;

public class Pants extends Clothes implements MensClothing, WomenClothing {
    @Override
    public void dressAMan() {
        System.out.println("Мужчина надел штаны");
    }

    @Override
    public void dressAWoman() {
        System.out.println("Женщина надела штаны");
    }
}
