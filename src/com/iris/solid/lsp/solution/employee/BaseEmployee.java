package com.iris.solid.lsp.solution.employee;

import com.iris.solid.common.Gender;

public abstract class BaseEmployee implements IEmployee {

    private String id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private double salary;

    public BaseEmployee(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 12.50;
        setSalary(baseAmount + (rank * 2));
    }
}
