import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class AdministradorTest {

    @Test
    public void  given_one_managment_when_correct_information_then_ok () throws SQLException {
        Administrador admin1 = new Administrador();
        assertSame(true, admin1.registrarAdministrador(2, "Cristopher Jaramillo", "0987143826", "cristopher@hotmail.com"));
    }

}