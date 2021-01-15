package ec.edu.epn;

import ec.edu.epn.Conexion;
import org.junit.Test;

public class ConexionTest {

    @Test
    public void given_a_conection_when_conection_pass_them_ok(){

        Conexion conectar = new Conexion();
        conectar.abrirConexion();
    }

}