package by.tms.instrument.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Guitar implements Instrument {
    private int stringValue;

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн " + stringValue);
    }
}
