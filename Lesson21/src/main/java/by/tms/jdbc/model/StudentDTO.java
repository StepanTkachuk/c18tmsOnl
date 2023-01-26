package by.tms.jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDTO {
    private String name;
    private String surname;
    private int course;
    private String cityName;


}
