package com.iris.solid.srp.violation.employee;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import com.iris.solid.common.Gender;

public class Employee {

    private static final Map<String, Employee> EMPLOYEES = new HashMap<>();

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

    public static List<Employee> getAll() {
        return List.copyOf(EMPLOYEES.values());
    }

    public static Optional<Employee> getById(String id) {
        Objects.requireNonNull(id, "id cannot be null");
        return Optional.ofNullable(EMPLOYEES.get(id));
    }

    public static void save(Employee employee) {
        Objects.requireNonNull(employee, "employee cannot be null");
        employee.setId(UUID.randomUUID().toString());
        EMPLOYEES.put(employee.getId(), employee);
    }

    public static void update(Employee employee) {
        Objects.requireNonNull(employee, "employee cannot be null");
        if (employee.getId() != null && EMPLOYEES.containsKey(employee.getId()))
            EMPLOYEES.put(employee.getId(), employee);
    }

    public static void delete(String id) {
        EMPLOYEES.remove(id);
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
