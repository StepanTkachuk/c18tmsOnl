package result4;

import java.io.*;

public class Task4 {
    private static String FILE = "Lesson15/src/main/java/result4/car.ser";

    public static void main(String[] args) {
        Car car = new Car("BMW", 283, 70000);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE))) {
            outputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Car carFromFile = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE))) {
            carFromFile = (Car) inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(carFromFile);
    }
}
