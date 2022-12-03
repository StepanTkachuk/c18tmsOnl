package by.tms.flower;

public class Main {
    public static void main(String[] args) {
        FlowerMarket flowerMarket = new FlowerMarket();
        Bouquet bouquet = flowerMarket.getBouquet("ROSE", "TULIP", "HERBERA");
        bouquet.getPrice();
        bouquet.infoAboutBouquet();
        flowerMarket.calculateCellFlowers();
        Bouquet bouquet1 = flowerMarket.getBouquet("ROSE", "TULIP", "HERBERA", "LILY");
        bouquet1.getPrice();
        bouquet1.infoAboutBouquet();
        flowerMarket.calculateCellFlowers();
    }
}
