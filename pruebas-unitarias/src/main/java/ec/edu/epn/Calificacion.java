package ec.edu.epn;

import java.sql.PreparedStatement;

public class Calificacion {

    public boolean registrarCalificaciones(int id, int calificacion, String observacion){

        Conexion conexion = new Conexion();
        String insertar = "INSERT  INTO Calificacion (idCalificacion, calificacion, observacion) values (?,?,?) ";
        try{
            PreparedStatement pt = conexion.abrirConexion().prepareCall(insertar);
            pt.setInt(1,id);
            pt.setInt(2,calificacion);
            pt.setString(3,observacion);

            int registro = pt.executeUpdate();
            if(registro > 0){
                System.out.println("ec.edu.epn.Calificacion registrada con éxito");
                conexion.cerrarConexion();
            }
            else {
                System.out.println("No se pudo registrar la calificacion");
                conexion.cerrarConexion();
            }
            return true;
        }
        catch (Exception e){
            System.out.println(e);
            return false;
        }

        //listaCalificacion(id, calificacion, observacion);

    }
}
