package by.tms.service;

import by.tms.model.Student;
import by.tms.repository.StudentRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public List<Student> findStudents() {
        return studentRepository.findStudents().stream().sorted(Comparator.comparingInt(Student::getId))
                .collect(Collectors.toList());
    }
}