package by.tms.transport;

public class LandTransport extends Transport {
    private int valueWheels;
    private int fuelСonsumption;

    public LandTransport(int power, int maxSpeed, int weight, String model, int valueWheels, int fuelСonsumption) {
        super(power, maxSpeed, weight, model);
        this.valueWheels = valueWheels;
        this.fuelСonsumption = fuelСonsumption;
    }

    public int getValueWheels() {
        return valueWheels;
    }

    public int getFuelСonsumption() {
        return fuelСonsumption;
    }
}
