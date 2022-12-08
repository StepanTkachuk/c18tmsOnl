package by.tms.flower;

public class FlowerMarket {

   private Bouquet bouquet;
    private int countFlowers = 0;


    public Bouquet getBouquet(String... flowers) {
        Flower[] arrayFlowers = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            countFlowers++;
            FlowerType flowerType = FlowerType.valueOf(flowers[i]);
            arrayFlowers[i] = new Flower(flowerType.name(), flowerType.getCost());
        }
        return new Bouquet(arrayFlowers);
    }

    public void calculateCellFlowers() {
        System.out.println("Всего продано цветов " + countFlowers);
    }
}
