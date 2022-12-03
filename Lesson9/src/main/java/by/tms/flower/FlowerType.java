package by.tms.flower;

import lombok.Getter;
import lombok.Setter;

public enum FlowerType {
    @Getter
    @Setter
    ROSE(5), LILY(3), HERBERA(1), TULIP(2), CARNATION(4);
    int cost;

    FlowerType(int cost) {
        this.cost = cost;
    }
}
