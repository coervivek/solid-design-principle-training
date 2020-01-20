package com.iris.solid.lsp.solution.employee;

import com.iris.solid.common.Gender;

public class CEO extends BaseEmployee implements IManager {

    public CEO(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    public void fireSomeone() {
        System.out.println("You're Fired!");
    }

    @Override
    public void generatePerformanceReview() {
        System.out.println("I am reviewing a direct report's performance.");
    }

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 150;
        setSalary(baseAmount * rank);
    }
}
