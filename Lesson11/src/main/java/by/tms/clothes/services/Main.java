package by.tms.clothes.services;

import by.tms.clothes.models.*;

public class Main {
    public static void main(String[] args) {
        Clothes clothes[] = new Clothes[4];
        clothes[0] = new Shirt();
        clothes[1] = new Pants();
        clothes[2] = new Skirt();
        clothes[3] = new Tie();
        Studio studio = new Studio();
        studio.dressMan(clothes);
        studio.dressWomen(clothes);
    }
}
