package by.tms.flower;

public class Main {
    public static void main(String[] args) {
        FlowerMarket flowerMarket = new FlowerMarket();
        Bouquet bouquet = flowerMarket.getBouquet("РОЗА", "ТЮЛЬПАН", "РОМАШКА");
        bouquet.getPrice();
        bouquet.infoAboutBouquet();
    }
}
