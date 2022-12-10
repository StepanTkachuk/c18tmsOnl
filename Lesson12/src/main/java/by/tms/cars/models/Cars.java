package by.tms.cars.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Cars {
    private String model;
    private int speed;
    private int price;

    public void start() {
        Random random = new Random();
        try {
            if (random.nextInt() % 2 != 0)
                throw new MyExceptionClass();
        } catch (MyExceptionClass e) {
            System.out.println("Exception: " + e.toString());
            return;
        }
        System.out.println("Машина марки " + getModel() + " завелась");
    }
}
