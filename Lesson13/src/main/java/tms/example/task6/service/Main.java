package tms.example.task6.service;

import tms.example.task6.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Лев Николаевич Толстой", 200.3456));
        employees.add(new Employee("Александр Сергеевич Пушкин", 451.123546352));
        employees.add(new Employee("Антон Геннадьевич Овсейчик", 4500.9342));
        ReportAware reportAware = new Report();
        reportAware.generateReport(employees);
    }
}
