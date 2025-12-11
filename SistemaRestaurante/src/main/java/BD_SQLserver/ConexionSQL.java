
package BD_SQLserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=RestauranteDB;encrypt=false;";
    private static final String USER = "userRest";
    private static final String PASSWORD = "sistema";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error en la conexión con SQL Server: " + e.toString());
            return null;
        }
    }
}
