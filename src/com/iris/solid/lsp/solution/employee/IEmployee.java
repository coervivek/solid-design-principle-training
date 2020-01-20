package com.iris.solid.lsp.solution.employee;

import com.iris.solid.common.Gender;

public interface IEmployee {

    String getId();

    void setId(String id);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    Gender getGender();

    void setGender(Gender gender);

    double getSalary();

    void setSalary(double salary);

    void calculatePerHourRate(int rank);
}
