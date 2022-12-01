package by.tms.transport;

public class Military extends AirTransport {
    private boolean catapult;
    private int rocketValue;

    public void shot() {
        if (getRocketValue() > 0) {
            System.out.println("Ракета пошла!");
        } else {
            System.out.println("Боеприпасы отсутствуют.");
        }
    }

    public void catapult() {
        if (isCatapult()) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    public String getInfo() {
        return getPower() + " " + getMaxSped() + " " + getWeight() + " " + getModel() + " " + isCatapult() + " " + getRocketValue() + " " + convertPower();
    }

    public Military(int power, int maxSpeed, int weight, String model, int wingspan, int minRunwayLengthForTakeoff, boolean catapult, int rocketValue) {
        super(power, maxSpeed, weight, model, wingspan, minRunwayLengthForTakeoff);
        this.catapult = catapult;
        this.rocketValue = rocketValue;
    }

    public boolean isCatapult() {
        return catapult;
    }

    public int getRocketValue() {
        return rocketValue;
    }
}
