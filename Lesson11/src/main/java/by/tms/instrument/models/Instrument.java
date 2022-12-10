package by.tms.instrument.models;

public interface Instrument {
    String KEY = "До мажор";

    enum TypeOfInstruments {
        GUITAR, DRUM, TRUMPET;
    }

    void play();
}
