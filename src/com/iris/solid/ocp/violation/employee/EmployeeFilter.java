package com.iris.solid.ocp.violation.employee;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.iris.solid.common.Gender;

public class EmployeeFilter {

    public Collection<Employee> filterByFirstName(List<Employee> employees, String firstName) {
        return employees.stream()
            .filter(employee -> employee.getFirstName().equals(firstName))
            .collect(Collectors.toUnmodifiableList());
    }

    public Collection<Employee> filterByLastName(List<Employee> employees, String lastName) {
        return employees.stream()
            .filter(employee -> employee.getLastName().equals(lastName))
            .collect(Collectors.toUnmodifiableList());
    }

    public Collection<Employee> filterByGender(List<Employee> employees, Gender gender) {
        return employees.stream()
            .filter(employee -> employee.getGender() == gender)
            .collect(Collectors.toUnmodifiableList());
    }

    public Collection<Employee> filterBySalaryEqualOrMore(List<Employee> employees, double salary) {
        return employees.stream()
            .filter(employee -> employee.getSalary() >= salary)
            .collect(Collectors.toUnmodifiableList());
    }


    public Collection<Employee> filterBySalaryEqualOrLess(List<Employee> employees, double salary) {
        return employees.stream()
            .filter(employee -> employee.getSalary() <= salary)
            .collect(Collectors.toUnmodifiableList());
    }
}
