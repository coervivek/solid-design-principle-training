package com.iris.solid.ocp.violation.employee;

import java.util.List;

import com.iris.solid.common.Gender;

public class Main {

	public static void main(String[] args) {
		Employee james = new Employee("James", "Gosling", Gender.MALE, 50_000);
		Employee martin = new Employee("Martin", "Odersky", Gender.MALE, 45_000);
		Employee jamesWife = new Employee("JamesWife", "Gosling", Gender.FEMALE, 60_000);
		Employee martinWife = new Employee("MartinWife", "Odersky", Gender.FEMALE, 55_000);

		List<Employee> employees = List.of(james, jamesWife, martin, martinWife);

		EmployeeFilter employeeFilter = new EmployeeFilter();

		System.out.println("All male employees:");
		employeeFilter.filterByGender(employees, Gender.MALE).forEach(System.out::println);

		System.out.println("All employees with first name James:");
		employeeFilter.filterByFirstName(employees, "James").forEach(System.out::println);

		System.out.println("All employees with last name Odersky");
		employeeFilter.filterByLastName(employees, "Odersky").forEach(System.out::println);
	}
}
