import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void  given_one_client_when_correct_information_then_ok () throws SQLException {
        Cliente cliente = new Cliente();
        assertSame(true, cliente.registrarCliente(2, "Franklin Mera", "0984951424", "franklin@gmail.com", "La machala"));
    }

}