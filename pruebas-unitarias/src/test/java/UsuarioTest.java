
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class UsuarioTest {

    @Test
    public void  given_one_user_when_correct_information_then_ok () throws SQLException {
        Usuario usuario = new Usuario();
        assertSame(true, usuario.registrarUsuario(2,"Carlos97","*******","07-01-2021", "Cliente"));
    }


}