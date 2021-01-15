package ec.edu.epn;

import java.sql.SQLException;

public class main {

    public static void main(String[] args) throws SQLException {

        Administrador admin1 = new Administrador();
        admin1.registrarAdministrador(5,"Nathaly Mafla", "0983974092", "nathy@gmail.com");

        Cliente cli1 = new Cliente();
        cli1.registrarCliente(5, "Cecilia Morales", "0987243826", "cecita@gmail.com", "El condado");

        LugarTuristico lugar1 = new LugarTuristico();
        lugar1.registrarLugarTuristico(5,"Salinas", "playas", "24 H", "todos los días", "manabi");

    }

}
