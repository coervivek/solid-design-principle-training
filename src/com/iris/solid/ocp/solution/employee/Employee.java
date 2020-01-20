package com.iris.solid.ocp.solution.employee;

import com.iris.solid.common.Gender;

public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private double salary;

    public Employee(String firstName, String lastName, Gender gender, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id='" + id + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", gender=" + gender +
            ", salary=" + salary +
            '}';
    }
}
