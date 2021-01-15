package ec.edu.epn;

import ec.edu.epn.Categoria;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class categoriaTest {

    @Test
    public void  given_one_category_when_correct_information_then_ok () throws SQLException {
        Categoria categoria = new Categoria();
        assertSame(true, categoria.registrarCategoria(2, "Piscinas", "Paradiasiacas Baniarios"));
    }

}