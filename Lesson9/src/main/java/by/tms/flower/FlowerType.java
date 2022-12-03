package by.tms.flower;

import lombok.Getter;
import lombok.Setter;

public enum FlowerType {
    @Getter
    @Setter
    РОЗА(5), ТЮЛЬПАН(3), РОМАШКА(1), АСТРА(2), ХРИЗАНТЕМА(4);
    int cost;

    FlowerType(int cost) {
        this.cost = cost;
    }
}
