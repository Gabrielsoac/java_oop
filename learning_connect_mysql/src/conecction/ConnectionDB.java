package conecction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static final String url = "jdbc:mysql://localhost:3306/mysql_java";
    private static final String user = "root";
    private static final String password = "Gc290874@";

    private static Connection conn;

    public static Connection getConnection(){

        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            }
            else {
                return conn;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}