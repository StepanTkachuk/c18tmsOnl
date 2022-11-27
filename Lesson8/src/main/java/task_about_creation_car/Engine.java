package task_about_creation_car;

public class Engine {
    private final String type;
    boolean condition; //false - заглушен. true - запущен


    public Engine(String type) {
        this.type = type;
    }

    public void startEngine() {
        System.out.println("Двигатель начал запускаться");
        System.out.println("Двигатель запущен");
    }

    public void stopEngine() {
        System.out.println("Двигатель начал остановку");
        System.out.println("Двигатель заглушен");
    }
}
