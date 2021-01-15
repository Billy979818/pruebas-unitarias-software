package ec.edu.epn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    Connection conexion = null;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password="";
    private static final String url="jdbc:mysql://localhost:3306/lugarTuristico";

    public Connection abrirConexion() {


        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, password);
            if (conexion != null) {
                System.out.println("Conectado!!");
            }
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error " + ex);
        }
        return conexion;
    }

    public void cerrarConexion() {
        try {
            conexion.close();
            System.out.println("ec.edu.epn.Conexion cerrada con éxito");
        }catch (SQLException  sqle) {
            System.out.println(sqle);
        }
    }

}
