import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Administrador {

    public boolean registrarAdministrador(int id, String nombreAdministrador, String telefonoAdministrador, String correoAdministrador) throws SQLException {

        Conexion conexion = new Conexion();

        String insertar = "INSERT  INTO Administrador (idAdministrador, nombreAdministrador, telefonoAdministrador, correoAdministrador) values (?,?,?,?) ";
        try{
            PreparedStatement pt = conexion.abrirConexion().prepareCall(insertar);
            pt.setInt(1,id);
            pt.setString(2,nombreAdministrador);
            pt.setString(3,telefonoAdministrador);
            pt.setString(4,correoAdministrador);


            int registro = pt.executeUpdate();
            if(registro > 0){
                System.out.println("Administrador registrado con éxito");
                conexion.cerrarConexion();
            }
            else {
                System.out.println("No se pudo registrar el Administrador");
                conexion.cerrarConexion();
            }
            return true;

        }
        catch (Exception e){
            System.out.println(e);
            return false;
        }


    }
}
