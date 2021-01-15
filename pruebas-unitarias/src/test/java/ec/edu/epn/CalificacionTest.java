package ec.edu.epn;

import ec.edu.epn.Calificacion;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class CalificacionTest {

    @Test
    public void  given_one_grade_when_correct_information_then_ok () throws SQLException {
        Calificacion calificacion = new Calificacion();
        assertSame(true, calificacion.registrarCalificaciones(1,4, "excelente servicio falta limpieza "));
    }

}