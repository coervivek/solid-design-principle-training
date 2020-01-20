package com.iris.solid.ocp.solution.employee;

public class EmployeeFirstNameSpecification implements Condition<Employee> {

    private final String firstName;

    public EmployeeFirstNameSpecification(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean isSatisfied(Employee employee) {
        return employee.getFirstName().equals(firstName);
    }
}
