package ec.edu.epn;

import ec.edu.epn.LugarTuristico;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class LugarTuristicoTest {

    @Test
    public void  given_one_turitic_place_when_correct_information_then_ok () throws SQLException {
        LugarTuristico lugar = new LugarTuristico();
        assertSame(true, lugar.registrarLugarTuristico(2,"Papallacta", "Piscinas", "08:00 - 21:00","martes a domingo", "ruta viva"));
    }

}