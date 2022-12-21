package tms.example.task6.service;

import tms.example.task6.models.Employee;

import java.util.List;

public class Report implements ReportAware {
    @Override
    public void generateReport(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.printf("| %-20s | %20.2f | \n", getAbbreviatedName(employee.getFullName()), employee.getSalary());
        }
    }

    private String getAbbreviatedName(String string) {
        StringBuilder fcs = new StringBuilder();
        String[] arrayString = string.split(" ");
        for (int i = 0; i < arrayString.length - 1; i++) {
            fcs.append(arrayString[i].toCharArray()[0]).append(". ");
        }
        fcs.append(arrayString[arrayString.length - 1]);
        return fcs.toString();
    }
}
