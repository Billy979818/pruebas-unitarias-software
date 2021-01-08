import org.junit.Test;

import static org.junit.Assert.*;

public class ConexionTest {

    @Test
    public void given_a_conection_when_conection_pass_them_ok(){

        Conexion conectar = new Conexion();
        conectar.abrirConexion();
    }

    @Test
    public void given_a_connection_close_when_connection_null_the_ok(){
        Conexion conectar = new Conexion();
        conectar.abrirConexion();
        conectar.cerrarConexion();
    }

}