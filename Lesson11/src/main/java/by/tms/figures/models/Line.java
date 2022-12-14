package by.tms.figures.models;

import lombok.experimental.SuperBuilder;


@SuperBuilder
public class Line extends Figure {

    private double length;


    @Override
    public Type getType() {
        return Type.LINE;
    }
}
