package by.tms.flower;

public class FlowerMarket {

    Bouquet bouquet;


    public Bouquet getBouquet(String... flowers) {
        Flower[] arrayFlowers = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            FlowerType flowerType = FlowerType.valueOf(flowers[i]);
            arrayFlowers[i] = new Flower(flowerType.name(), flowerType.cost);
        }
        return new Bouquet(arrayFlowers);
    }

    public void calculationCostBouquet() {
        int costBouquet = 0;
        for (int i = 0; i < bouquet.getFlowers().length; i++) {
            costBouquet += bouquet.getFlowers()[i].getCost();
        }
        System.out.println("Стоимость букета равна " + costBouquet);
    }

    public void infoAboutBouquet(Bouquet bouquet) {
        System.out.print("Букет состоит из: ");
        for (int i = 0; i < bouquet.getFlowers().length; i++) {
            System.out.print(bouquet.getFlowers()[i].getName() + " стоимостью " + bouquet.getFlowers()[i].getCost() + " ");
        }
    }
}
