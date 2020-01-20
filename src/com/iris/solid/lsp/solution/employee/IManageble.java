package com.iris.solid.lsp.solution.employee;

public interface IManageble extends IEmployee {

    IEmployee getManager();

    void assignManager(IEmployee manager);
}
