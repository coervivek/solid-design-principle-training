package com.iris.solid.ocp.solution.employee;

import java.util.List;

import com.iris.solid.common.Gender;

public class Main {

	public static void main(String[] args) {
		Employee james = new Employee("James", "Gosling", Gender.MALE, 50_000);
		Employee martin = new Employee("Martin", "Odersky", Gender.MALE, 45_000);
		Employee jamesWife = new Employee("JamesWife", "Gosling", Gender.FEMALE, 60_000);
		Employee martinWife = new Employee("MartinWife", "Odersky", Gender.FEMALE, 55_000);

		List<Employee> employees = List.of(james, jamesWife, martin, martinWife);

		Filter<Employee> employeeFilter = new EmployeeFilter();

		System.out.println("All Male Employees:");
		employeeFilter.filter(employees, new EmployeeGenderSpecification(Gender.MALE)).forEach(System.out::println);

		System.out.println("All Female Employees:");
		employeeFilter.filter(employees, new EmployeeGenderSpecification(Gender.FEMALE)).forEach(System.out::println);

		// Or you can provide specification as lambda's
		System.out.println("All Employee with salary more than 50_000");
		employeeFilter.filter(employees, employee -> employee.getSalary() > 50_000).forEach(System.out::println);
	}
}
