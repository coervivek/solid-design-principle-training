package com.iris.solid.ocp.solution.writter;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		FileExporter fileExporter = new FileExporter();
		OrderExportWriter orderExportWriter = new OrderExportWriter(getOrders());
		UserExportWriter userExportWriter = new UserExportWriter(getUsers());

		fileExporter.export("orders.txt", orderExportWriter::writeContent);
		fileExporter.export("users.txt", userExportWriter::writeContent);
	}

	public static List<Order> getOrders() {
		LocalDate dt = LocalDate.now();
		return List.of(new Order(dt), new Order(dt), new Order(dt), new Order(dt), new Order(dt));
	}

	public static List<User> getUsers() {
		return List.of(new User("Vivek", "Panday"), new User("Ravi", "Tiwari"));
	}
}
