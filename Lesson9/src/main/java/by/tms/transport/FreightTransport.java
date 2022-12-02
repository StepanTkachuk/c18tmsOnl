package by.tms.transport;

public class FreightTransport extends LandTransport {
    private int loadCapacity;

    public void checkCargo(int cargoWeight) {
        if (cargoWeight > getLoadCapacity()) {
            System.out.println("Вам нужен грузовик побольше");
        } else {
            System.out.println("Грузовик загружен");
        }
    }

    public FreightTransport(int power, int maxSpeed, int weight, String model, int valueWheels, int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, model, valueWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public String getInfo() {
        return getPower() + " " + getMaxSped() + " " + getWeight() + " " + getModel() + " " + getValueWheels() + " " + getFuelСonsumption() + " " + getLoadCapacity() + " " + convertPower();
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
