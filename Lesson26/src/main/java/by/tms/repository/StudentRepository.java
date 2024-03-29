package by.tms.repository;

import by.tms.model.Student;

import java.util.List;

public interface StudentRepository {

    List<Student> findStudents();

    List<Student> addStudent(Student student);

}