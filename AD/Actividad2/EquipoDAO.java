package dao;

import model.Equipo;
import model.Liga;
import org.hibernate.Session;
import utils.Entrada;

public class EquipoDAO {
    public void crearEquipo(String nombre, String ciudad, Liga liga) {
        Session session = Entrada.getSessionFactory().openSession();
        Equipo equipo = new Equipo();
        equipo.setNombre(nombre);
        equipo.setCiudad(ciudad);
        equipo.setLiga(liga);

        session.beginTransaction();
        session.save(equipo);
        session.getTransaction().commit();
        session.close();
    }
}
