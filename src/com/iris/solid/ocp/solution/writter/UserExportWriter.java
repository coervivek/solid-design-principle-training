package com.iris.solid.ocp.solution.writter;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class UserExportWriter {

    private List<User> users;

    public UserExportWriter(List<User> users) {
        this.users = users;
    }

    public void writeContent(Writer writer) {
        try {
            writer.write("UserID;Name\n");
            users.stream()
                .map(user -> user.getId() + ";" + user.getFullName())
                .forEach(line -> {
                    try { writer.write(line); }
                    catch (IOException ignored) {}
                });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
