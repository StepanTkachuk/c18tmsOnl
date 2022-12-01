package by.tms.transport;

public class PassengerTransport extends LandTransport {
    private String bodyType;
    private int passengerValue;
    private double tripTime = 2.5;

    public String getInfo() {
        return getPower() + " " + getMaxSped() + " " + getWeight() + " " + getModel() + " " + getValueWheels() + " " + getFuelСonsumption() + " " + getBodyType() + " " + getPassengerValue() + " " + convertPower();
    }

    private double calculationFuel() {
        return getMaxSped() * tripTime * getFuelСonsumption() / 100;
    }

    public String calculationTrip() {
        return "За время " + tripTime + " автомобиль " + getModel() + " двигаясь с максимальной скоростью " + getMaxSped() + " км/ч проедет " + getMaxSped() * tripTime + " и израсходует " + calculationFuel() + " литров топлива";
    }

    public PassengerTransport(int power, int maxSpeed, int weight, String model, int valueWheels, int fuelСonsumption, String bodyType, int passengerValue) {
        super(power, maxSpeed, weight, model, valueWheels, fuelСonsumption);
        this.bodyType = bodyType;
        this.passengerValue = passengerValue;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getPassengerValue() {
        return passengerValue;
    }
}

