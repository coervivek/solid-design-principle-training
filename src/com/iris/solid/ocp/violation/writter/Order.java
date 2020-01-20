package com.iris.solid.ocp.violation.writter;

import java.time.LocalDate;
import java.util.UUID;

public class Order {

    private final String id;
    private final LocalDate creationDate;

    public Order(LocalDate creationDate) {
        this.id = UUID.randomUUID().toString();
        this.creationDate = creationDate;
    }

    public String getId() {
        return id;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
}
