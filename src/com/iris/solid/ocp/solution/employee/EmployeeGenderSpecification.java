package com.iris.solid.ocp.solution.employee;

import com.iris.solid.common.Gender;

public class EmployeeGenderSpecification implements Condition<Employee> {

    private final Gender gender;

    public EmployeeGenderSpecification(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean isSatisfied(Employee employee) {
        return employee.getGender() == gender;
    }
}
