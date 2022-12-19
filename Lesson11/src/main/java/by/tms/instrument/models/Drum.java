package by.tms.instrument.models;

public class Drum implements Instrument {
    private int drumValue;

    public Drum(int parameter) {

    }

    @Override
    public void play() {
        System.out.println("Играют барабаны c размером " + drumValue);
    }
}
