package by.tms.flower;

public class Bouquet {
    private Flower[] flowers;

    public void getPrice() {
        int costBouquet = 0;
        for (int i = 0; i < flowers.length; i++) {
            costBouquet += flowers[i].cost;
        }
        System.out.println("Стоимость букета равна " + costBouquet);
    }

    public void infoAboutBouquet() {
        System.out.print("Букет состоит из: ");
        for (int i = 0; i < flowers.length; i++) {
            System.out.print(flowers[i].name + " стоимостью " + flowers[i].getCost() + " ");
        }
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

}
