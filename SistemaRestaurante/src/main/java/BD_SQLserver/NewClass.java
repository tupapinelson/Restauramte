
package BD_SQLserver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class NewClass {
    public static void main(String[] args) {

        Connection con = ConexionSQL.conectar();

        if (con == null) {
            System.out.println("❌ La conexión falló");
            return;
        }

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT 1");
            if (rs.next()) {
                System.out.println("✅ Conexión REAL a SQL Server confirmada (SELECT 1)");
            }
            con.close();

        } catch (Exception e) {
            System.out.println("❌ Error ejecutando prueba: " + e.getMessage());
        }
    }
    
}
