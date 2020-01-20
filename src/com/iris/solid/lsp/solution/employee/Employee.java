package com.iris.solid.lsp.solution.employee;

import com.iris.solid.common.Gender;

public class Employee extends BaseEmployee implements IManaged {

    private IEmployee manager;

    public Employee(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    public IEmployee getManager() {
        return manager;
    }

    public void assignManager(IEmployee manager) {
        this.manager = manager;
    }
}
