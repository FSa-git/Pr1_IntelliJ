package _32_FastFoodBestellTool;

import java.sql.*;

public class db {


        // MySQL-Datenbankverbindung herstellen
    public static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:8889/KrustyKrab", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static ResultSet select(String query) throws SQLException {

        // SQL-Abfrage ausführen
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);


        return resultSet;

    }

}
