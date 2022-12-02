package by.tms.transport;

public class Civil extends AirTransport {
    private int maxPassengerValue;
    private boolean businessClass;

    public void checkPassengerValue(int passengerValue) {
        if (passengerValue > getMaxPassengerValue()) {
            System.out.println("Вам нужен самолет побольше");
        } else {
            System.out.println("Самолет загружен");
        }
    }

    public String getInfo() {
        return getPower() + " " + getMaxSped() + " " + getWeight() + " " + getModel() + " " + getMaxPassengerValue() + " " + isBusinessClass() + " " + convertPower();
    }

    public Civil(int power, int maxSpeed, int weight, String model, int wingspan, int minRunwayLengthForTakeoff, int maxPassengerValue, boolean businessClass) {
        super(power, maxSpeed, weight, model, wingspan, minRunwayLengthForTakeoff);
        this.maxPassengerValue = maxPassengerValue;
        this.businessClass = businessClass;
    }

    public int getMaxPassengerValue() {
        return maxPassengerValue;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }
}
