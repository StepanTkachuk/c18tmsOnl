package task_about_creation_car;

public class GasTank {

    private int maxFuelCount;
    int fuelCount;

    public GasTank(int maxFuelCount, int fuelCount) {
        this.maxFuelCount = maxFuelCount;
        this.fuelCount = fuelCount;
    }

    public void tankFilling() {
        System.out.println("Машина начала заправляться до полного бака");
        fuelCount = maxFuelCount;
        System.out.println("Машина заправлена");
    }

    public int getMaxFuelCount() {
        return maxFuelCount;
    }

    public int getFuelCount() {
        return fuelCount;
    }

    public void setFuelCount(int fuelCount) {
        this.fuelCount = fuelCount;
    }
}
