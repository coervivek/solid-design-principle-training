package com.iris.solid.ocp.solution.writter;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class OrderExportWriter {

    private List<Order> orders;

    public OrderExportWriter(List<Order> orders) {
        this.orders = orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void writeContent(Writer writer) {
        try {
            writer.write("OrderID;Date\n");
            orders.stream()
                .map(order -> order.getId() + ";" + order.getCreationDate())
                .forEach(line -> {
                    try { writer.write(line); }
                    catch (IOException e) { e.printStackTrace(); }
                });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
