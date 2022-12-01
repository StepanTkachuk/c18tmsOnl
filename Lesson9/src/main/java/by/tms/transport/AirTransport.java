package by.tms.transport;

public class AirTransport extends Transport {
    private int wingspan;
    private int minRunwayLengthForTakeoff;

    public AirTransport(int power, int maxSpeed, int weight, String model, int wingspan, int minRunwayLengthForTakeoff) {
        super(power, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.minRunwayLengthForTakeoff = minRunwayLengthForTakeoff;
    }
}
