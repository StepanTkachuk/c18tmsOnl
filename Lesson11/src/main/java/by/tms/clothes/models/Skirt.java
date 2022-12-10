package by.tms.clothes.models;

public class Skirt extends Clothes implements WomenClothing {
    @Override
    public void dressAWoman() {
        System.out.println("Женщина надела юбку");
    }
}
