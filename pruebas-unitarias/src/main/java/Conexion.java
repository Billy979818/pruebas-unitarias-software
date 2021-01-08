import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    Connection conexion = null;
    public Connection abrirConexion() {


        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-ADTDP02:1433;database=lugarTuristico;integratedSecurity=true;";
            conexion = DriverManager.getConnection(connectionUrl);
            System.out.println("Conectado.");
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error.");
        }
        return conexion;
    }

    public void cerrarConexion() {
        try {
            conexion.close();
            System.out.println("Conexion cerrada con éxito");
        }catch (SQLException  sqle) {
            System.out.println(sqle);
        }
    }

}
