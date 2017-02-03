package org.pradeep.javaperks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagement {

	public Connection getConnection() {

		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "qwerty");
		} catch (SQLException e) {
			// Logger for exception
			e.printStackTrace();
		}
		return connection;
	}

}
