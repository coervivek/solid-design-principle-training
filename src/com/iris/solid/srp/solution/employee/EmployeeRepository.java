package com.iris.solid.srp.solution.employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class EmployeeRepository {

    private static final Map<String, Employee> EMPLOYEES = new HashMap<>();

    public List<Employee> getAll() {
        return List.copyOf(EMPLOYEES.values());
    }

    public Optional<Employee> getById(String id) {
        Objects.requireNonNull(id, "id cannot be null");
        return Optional.ofNullable(EMPLOYEES.get(id));
    }

    public void save(Employee employee) {
        Objects.requireNonNull(employee, "employee cannot be null");
        employee.setId(UUID.randomUUID().toString());
        EMPLOYEES.put(employee.getId(), employee);
    }

    public void update(Employee employee) {
        Objects.requireNonNull(employee, "employee cannot be null");
        if (employee.getId() != null && EMPLOYEES.containsKey(employee.getId()))
            EMPLOYEES.put(employee.getId(), employee);
    }

    public void delete(String id) {
        EMPLOYEES.remove(id);
    }
}
