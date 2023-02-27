package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student implements Serializable {
    private int id;
    private String name;
    private String surname;
    private int course;

    public Student(String name, String surname, Integer course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
}