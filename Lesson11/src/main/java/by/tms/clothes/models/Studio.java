package by.tms.clothes.models;

public class Studio {

    public void dressMan(Clothes[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof MensClothing) {
                ((MensClothing) clothes[i]).dressAMan();
            } else {
                System.out.println("Эта одежда не подходит");
            }
        }
    }

    public void dressWomen(Clothes[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof WomenClothing) {
                ((WomenClothing) clothes[i]).dressAWoman();
            } else {
                System.out.println("Эта одежда не подходит");
            }
        }
    }
}
