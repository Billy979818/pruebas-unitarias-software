import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Usuario {

    public boolean registrarUsuario(int id, String nombreUsuario, String contrasenia, String fechaRegistro, String rolUsuario) throws SQLException {

        Conexion conexion = new Conexion();
        String insertar = "INSERT  INTO Usuario (idUsuario, nombreUsuario, contrasenia, fechaRegistro, rolUsuario) values (?,?,?,?,?) ";
        try{
            PreparedStatement pt = conexion.abrirConexion().prepareCall(insertar);
            pt.setInt(1,id);
            pt.setString(2,nombreUsuario);
            pt.setString(3,contrasenia);
            pt.setString(4,fechaRegistro);
            pt.setString(5,rolUsuario);

            int registro = pt.executeUpdate();
            if(registro > 0){
                System.out.println("usuario registrado con éxito");
                conexion.cerrarConexion();
            }
            else {
                System.out.println("No se pudo registrar el usuario");
                conexion.cerrarConexion();
            }
            return true;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;

    }

}
