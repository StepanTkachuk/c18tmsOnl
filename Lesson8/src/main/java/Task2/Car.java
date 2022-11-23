package Task2;

public class Car {
    Engine engine;
    GasTank gasTank;
    String model;
    int yearOfIssue;
    int mileage;

    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public int getGasTank() {
        return gasTank.fuelCount;
    }

    public void startCar() {
        if (gasTank.getFuelCount() > 0 && !engine.condition) {
            engine.startEngine();
            System.out.println("Машина запущена");
            engine.condition = true;
        } else if (engine.condition) {
            System.out.println("Машина была запущена ранее");
        } else {
            System.out.println("Нет топлива");
        }
    }

    public void stopCar() {
        if (engine.condition) {
            System.out.println("Двигатель остановлен");
            engine.condition = false;
        } else {
            System.out.println("Двигатель не был запущен ранее");
        }
    }

    public void fillingCarTank() {
        gasTank.tankFilling();
        System.out.println("Текущее топливо в баке = " + gasTank.maxFuelCount);
    }

    public void drivingCar() {
        if (engine.condition) {
            System.out.println("Машина поехала");
            mileage += 5;
            gasTank.fuelCount -= 1;
        } else {
            System.out.println("Машина не запущена. Движение невозможно");
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void getMileage() {
        System.out.println("Текущий пробег машины за все время = " + mileage);
    }

    public void getFuelCount() {
        System.out.println("Топлива в баке " + gasTank.getFuelCount() + " литров");
    }
}
