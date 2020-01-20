package com.iris.solid.lsp.solution.employee;

public interface IManaged extends IEmployee {

    IEmployee getManager();

    void assignManager(IEmployee manager);
}
