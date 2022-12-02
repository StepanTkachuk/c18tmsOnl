package by.tms.transport;

public class Main {
    public static void main(String[] args) {
        PassengerTransport passengerTransport = new PassengerTransport(180, 225, 1960, "Honda", 4, 10, "Sedan", 4);
        System.out.println(passengerTransport.getInfo());
        System.out.println(passengerTransport.calculationTrip());
        System.out.println("!!!");
        FreightTransport freightTransport = new FreightTransport(500, 100, 7000, "Man", 6, 30, 30);
        System.out.println(freightTransport.getInfo());
        freightTransport.checkCargo(25);
        freightTransport.checkCargo(47);
        System.out.println("!!!");
        Civil civil = new Civil(5000, 820, 26000, "Boeing 737", 28, 3000, 103, true);
        System.out.println(civil.getInfo());
        civil.checkPassengerValue(97);
        civil.checkPassengerValue(147);
        System.out.println("!!!");
        Military military = new Military(3000, 2350, 35000, "СУ-30", 15, 1500, true, 10);
        System.out.println(military.getInfo());
        military.shot();
        military.catapult();
    }
}
