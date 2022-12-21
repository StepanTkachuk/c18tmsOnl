package tms.example.task6.service;

import tms.example.task6.models.Employee;

import java.util.List;

public interface ReportAware {
    void generateReport(List<Employee> employees);
}
