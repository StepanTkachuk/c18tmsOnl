package task_about_creation_car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(new Engine("Бензин"), new GasTank(65, 30));
        System.out.println("Проверяем текущие количество топлива в баке");
        car1.getFuelCount();
        System.out.println("Пробуем запустить машину");
        car1.startCar();
        System.out.println("Пробуем начать движение");
        car1.drivingCar();
        System.out.println("Пробуем заглушить машину");
        car1.stopCar();
        System.out.println("Узнаем общий пробег машины");
        car1.getMileage();
        System.out.println("Пробуем запустить машину");
        car1.startCar();
        System.out.println("Пробуем начать движение");
        car1.drivingCar();
        System.out.println("Пробуем заглушить машину");
        car1.stopCar();
        System.out.println("Пробуем опять запустить машину");
        car1.startCar();
        System.out.println("Пробуем заглушить машину");
        car1.stopCar();
        System.out.println("Пробуем начать движение");
        car1.drivingCar();
        System.out.println("Пробуем опять заглушить машину");
        car1.stopCar();
        System.out.println("Проверяем текущие количество топлива в баке");
        car1.getFuelCount();
        System.out.println("Заправляем машину");
        car1.fillingCarTank();
        System.out.println("Узнаем общий пробег машины");
        car1.getMileage();
        System.out.println("Проверяем текущие количество топлива в баке");
        car1.getFuelCount();
    }
}
