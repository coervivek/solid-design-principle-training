package com.iris.solid.lsp.violation.employee;

import com.iris.solid.common.Gender;

public class CEO extends Employee {

    public CEO(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    public void generatePerformanceReview() {
        System.out.println("I am reviewing a direct report's performance.");
    }

    public void fireSomeone() {
        System.out.println("You're Fired!");
    }

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 150;
        setSalary(baseAmount * rank);
    }

    @Override
    public void assignManager(Employee manager) {
        throw new IllegalStateException("The CEO has no manager...");
    }
}
