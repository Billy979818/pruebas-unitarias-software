import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Categoria {

    public boolean registrarCategoria (int id, String nombreCategoria, String descripcionCategoria) throws SQLException {

        Conexion conexion = new Conexion();

        String insertar = "INSERT  INTO Categoria (idCategoria, nombreCategoria, descripcion) values (?,?,?) ";
        try{
            PreparedStatement pt = conexion.abrirConexion().prepareCall(insertar);
            pt.setInt(1,id);
            pt.setString(2,nombreCategoria);
            pt.setString(3,descripcionCategoria);

            int registro = pt.executeUpdate();
            if(registro > 0){
                System.out.println("Categoria registrada con éxito");
                conexion.cerrarConexion();
            }
            else {
                System.out.println("No se pudo registrar la categoria");
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
