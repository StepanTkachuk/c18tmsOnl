package by.tms.service;

import by.tms.model.Student;
import by.tms.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findStudents() {
        return studentRepository.findStudents();
    }

    public List<Student> addStudent(Student student) {
        return studentRepository.addStudent(student);
    }
}