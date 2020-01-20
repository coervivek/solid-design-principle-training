package com.iris.solid.lsp.violation.employee;

import com.iris.solid.common.Gender;

public class Main {

    public static void main(String[] args) {
        Manager accountingVP = new Manager("Trisha", "Gee", Gender.FEMALE);
        accountingVP.calculatePerHourRate(4);

        validForEmployee(accountingVP);
        validForManager(accountingVP);
        invalidForCEO(accountingVP);
    }

    private static void validForEmployee(Manager accountingVP) {
        Employee employee = new Employee("John", "Doe", Gender.MALE);
        employee.assignManager(accountingVP);
        employee.calculatePerHourRate(2);

        printEmployeeInfo(employee);
    }

    private static void validForManager(Manager accountingVP) {
        Employee employee = new Manager("John", "Doe", Gender.MALE);
        employee.assignManager(accountingVP);
        employee.calculatePerHourRate(2);

        printEmployeeInfo(employee);
    }

    private static void invalidForCEO(Manager accountingVP) {
        Employee employee = new CEO("John", "Doe", Gender.MALE);

        // LSP is violated here.. Exception will be thrown
        employee.assignManager(accountingVP);
        employee.calculatePerHourRate(2);

        printEmployeeInfo(employee);
    }

    private static void printEmployeeInfo(Employee employee) {
        System.out.printf("%s's salary is $%s/hour.%n", employee.getFirstName(), employee.getSalary());
    }
}
