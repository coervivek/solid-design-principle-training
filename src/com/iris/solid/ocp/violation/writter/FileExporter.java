package com.iris.solid.ocp.violation.writter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileExporter {

    private static final Logger LOGGER = Logger.getLogger(FileExporter.class.getName());

    public File exportOrders(List<Order> orders, String fileName) throws IOException {
        File file = new File("export/" + fileName);
        try (Writer writer = new FileWriter(file)) {
            writer.write("OrderID;Date\n");
            orders.stream()
                .map(order -> order.getId() + ";" + order.getCreationDate())
                .forEach(line -> {
                    try {
                        writer.write(line);
                    } catch (IOException ignored) { }
                });
            return file;
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            throw e;
        }
    }

    public File exportUsers(List<User> users, String fileName) throws IOException {
        File file = new File("export/" + fileName);
        try (Writer writer = new FileWriter(file)) {
            writer.write("UserID;Name\n");
            users.stream()
                .map(user -> user.getId() + ";" + user.getFullName())
                .forEach(line -> {
                    try { writer.write(line); }
                    catch (IOException ignored) {}
                });
            return file;
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            throw e;
        }
    }
}
