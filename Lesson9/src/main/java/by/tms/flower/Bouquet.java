package by.tms.flower;

public class Bouquet {
    private Flower[] flowers;

    public void getPrice() {
        int costBouquet = 0;
        for (int i = 0; i < flowers.length; i++) {
            costBouquet += flowers[i].getCost();
        }
        System.out.println("Стоимость букета равна " + costBouquet);
    }

    public void infoAboutBouquet() {
        System.out.print("Букет состоит из: ");
        for (int i = 0; i < flowers.length; i++) {
            System.out.print(flowers[i].getName() + " стоимостью " + flowers[i].getCost() + " ");
        }
        System.out.println();
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

}
