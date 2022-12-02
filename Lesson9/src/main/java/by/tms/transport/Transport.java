package by.tms.transport;

public class Transport {
    private int power;
    private int maxSped;
    private int weight;
    private String model;


    public int convertPower() {
        return (int) (power * 0.73);
    }

    public Transport(int power, int maxSpeed, int weight, String model) {
        this.power = power;
        this.maxSped = maxSpeed;
        this.weight = weight;
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSped() {
        return maxSped;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }
}
