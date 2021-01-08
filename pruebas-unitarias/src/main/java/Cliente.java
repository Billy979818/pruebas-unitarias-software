import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cliente {

    public boolean registrarCliente(int id, String nombreCliente, String telefonoCliente, String correoCliente, String direccionCliente) throws SQLException {


        Conexion conexion = new Conexion();

        String insertar = "INSERT  INTO Clientes (idClienrte, nombreCliente, telefonoCliente, correoCliente, direccionCliente) values (?,?,?,?,?) ";
        try{
            PreparedStatement pt = conexion.abrirConexion().prepareCall(insertar);
            pt.setInt(1,id);
            pt.setString(2,nombreCliente);
            pt.setString(3,telefonoCliente);
            pt.setString(4,correoCliente);
            pt.setString(5,direccionCliente);

            int registro = pt.executeUpdate();
            if(registro > 0){
                System.out.println("cliente registrado con éxito");
                conexion.cerrarConexion();
            }
            else {
                System.out.println("No se pudo registrar el cliente");
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
