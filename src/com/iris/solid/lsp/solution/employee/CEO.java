package com.iris.solid.lsp.solution.employee;

import com.iris.solid.common.Gender;

public class CEO extends BaseEmployee implements IManager,ICEO {

	
    public CEO(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

	// Should be in another interface
	public void fireSomeone(IEmployee employee) {
		System.out.println("You're Fired!" + employee.getFirstName() + " " + employee.getLastName());
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

	@Override
	public void giveBonus() {
		// add bonus to organization
		
	}
}
