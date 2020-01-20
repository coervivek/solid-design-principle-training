package com.iris.solid.ocp.solution.employee;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter implements Filter<Employee> {

    @Override
    public Collection<Employee> filter(List<Employee> employees, Condition<Employee> condition) {
        return employees.stream()
            .filter(condition::isSatisfied)
            .collect(Collectors.toUnmodifiableList());
    }
}
