package by.tms.instrument.services;

import by.tms.instrument.models.Drum;
import by.tms.instrument.models.Guitar;
import by.tms.instrument.models.Instrument;
import by.tms.instrument.models.Trumpet;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = createInstrument(Instrument.TypeOfInstruments.GUITAR, 6);
        instruments[1] = createInstrument(Instrument.TypeOfInstruments.TRUMPET, 10);
        instruments[2] = createInstrument(Instrument.TypeOfInstruments.DRUM, 15);
        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();
        }
    }

    private static Instrument createInstrument(Instrument.TypeOfInstruments typeOfInstruments, int parameter) {
        return switch (typeOfInstruments) {
            case DRUM -> new Drum(parameter);
            case GUITAR -> new Guitar(parameter);
            case TRUMPET -> new Trumpet(parameter);
        };
    }
}
