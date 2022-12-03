package by.tms.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Flower {
    String name;
    int cost;

    public Flower(FlowerType flowerType) {

    }
}
