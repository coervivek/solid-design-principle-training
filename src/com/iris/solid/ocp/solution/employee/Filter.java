package com.iris.solid.ocp.solution.employee;

import java.util.Collection;
import java.util.List;

public interface Filter<T> {

    Collection<T> filter(List<T> items, Condition<T> condition);
}
