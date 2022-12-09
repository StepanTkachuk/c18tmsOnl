package by.tms.instrument.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Drum implements Instrument {
    private int drumValue;

    @Override
    public void play() {
        System.out.println("Играют барабаны c размером " + drumValue);
    }
}
