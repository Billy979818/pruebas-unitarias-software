package ec.edu.epn;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LugarTuristico {

    public boolean registrarLugarTuristico (int id, String nombreLugar, String categoriaLugar, String horarioAtencon, String diasAtencion, String direccionLugar) throws SQLException {

        Conexion conexion = new Conexion();
        String insertar = "INSERT  INTO LugarTuristico (idLugarTuristico, nombreLugar, categoriaLugar, horarioAtencion, diasAtencion, direccionLugar) values (?,?,?,?,?,?) ";
        try{
            PreparedStatement pt = conexion.abrirConexion().prepareCall(insertar);
            pt.setInt(1,id);
            pt.setString(2,nombreLugar);
            pt.setString(3,categoriaLugar);
            pt.setString(4,horarioAtencon);
            pt.setString(5,diasAtencion);
            pt.setString(6, direccionLugar);

            int registro = pt.executeUpdate();
            if(registro > 0){
                System.out.println("lugar turistico registrado con éxito");
                conexion.cerrarConexion();
            }
            else {
                System.out.println("No se pudo registrar el lugar turistico");
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
