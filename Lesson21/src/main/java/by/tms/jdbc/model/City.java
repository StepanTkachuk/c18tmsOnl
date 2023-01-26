package by.tms.jdbc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class City {
    private int id;
    private String city;

    public City(int id, String city) {
        this.id = id;
        this.city = city;
    }
}
