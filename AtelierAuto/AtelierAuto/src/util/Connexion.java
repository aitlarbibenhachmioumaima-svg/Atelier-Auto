package util;

import java.sql.*;

public class Connexion {

    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if(connection == null) {
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/atelier_auto",
                "root",
                ""
            );
        }
        return connection;
    }
}