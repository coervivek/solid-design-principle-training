package com.iris.solid.ocp.solution.employee;

public interface Condition<T> {

    boolean isSatisfied(T item);
}
