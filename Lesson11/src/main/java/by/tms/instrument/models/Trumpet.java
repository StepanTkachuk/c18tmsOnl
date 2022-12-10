package by.tms.instrument.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Trumpet implements Instrument {

    private int diameterTrump;

    @Override
    public void play() {
        System.out.println("Играет труба c диаметром " + diameterTrump);
    }
}
