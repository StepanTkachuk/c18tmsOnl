package by.tms.flower;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum FlowerType {
    @Setter
    ROSE(5), LILY(3), HERBERA(1), TULIP(2), CARNATION(4);
    private int cost;

    FlowerType(int cost) {
        this.cost = cost;
    }
}
