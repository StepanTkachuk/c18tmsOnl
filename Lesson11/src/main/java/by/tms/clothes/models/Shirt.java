package by.tms.clothes.models;

public class Shirt extends Clothes implements MensClothing, WomenClothing {
    @Override
    public void dressAMan() {
        System.out.println("Мужчина надел майку");
    }

    @Override
    public void dressAWoman() {
        System.out.println("Женщина надела майку");
    }
}
