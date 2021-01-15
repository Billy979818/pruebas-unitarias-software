package ec.edu.epn;

import ec.edu.epn.Cliente;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void  given_one_client_when_correct_information_then_ok () throws SQLException {
        Cliente cliente = new Cliente();
        assertSame(true, cliente.registrarCliente(2, "Miruam Morales", "0983974092", "miriam@gmail.com", "La machala"));
    }

}