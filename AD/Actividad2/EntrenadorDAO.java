package dao;

import model.Equipo;
import model.Entrenador;
import org.hibernate.Session;
import utils.Entrada;

public class EntrenadorDAO {
    public void crearEntrenador(String nombre, String apellido, int edad, Equipo equipo) {
        Session session = Entrada.getSessionFactory().openSession();
        Entrenador entrenador = new Entrenador();
        entrenador.setNombre(nombre);
        entrenador.setApellido(apellido);
        entrenador.setEdad(edad);
        entrenador.setEquipo(equipo);

        session.beginTransaction();
        session.save(entrenador);
        session.getTransaction().commit();
        session.close();
    }
}
