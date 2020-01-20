package com.iris.solid.lsp.violation.employee;

import com.iris.solid.common.Gender;

public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private Employee manager;
    private double salary;

    public Employee(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void calculatePerHourRate(int rank) {
        var baseAmount = 12.50;
        setSalary(baseAmount + (rank * 2));
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Employee getManager() {
        return manager;
    }

    public void assignManager(Employee manager) {
        this.manager = manager;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
