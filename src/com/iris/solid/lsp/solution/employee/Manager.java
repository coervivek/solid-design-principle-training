package com.iris.solid.lsp.solution.employee;

import com.iris.solid.common.Gender;

public class Manager extends Employee implements IManager {

    public Manager(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    @Override
    public void generatePerformanceReview() {
        System.out.println("I am reviewing a direct report's performance.");
    }

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 19.75;
        setSalary(baseAmount + (rank * 4));
    }
}
