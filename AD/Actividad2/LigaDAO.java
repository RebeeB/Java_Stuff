package dao;

import model.Liga;
import java.time.LocalDate;
import org.hibernate.Session; //no hace falta importar también org.hibernate.Session HibernateUtil;
import utils.Entrada;

public class LigaDAO {
    public void crearLiga(String nombre, LocalDate inicio, LocalDate fin) {
    }


    //Entrada.... porque es la clase que gestiona  Hibernate
    public Liga obtenerLiga(Long id) {
        Session session = Entrada.getSessionFactory().openSession();
        Liga liga = session.get(Liga.class, id);
        session.close();
        return liga;
    }

    public void actualizarLiga(Liga liga) {
        Session session = Entrada.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(liga);
        session.getTransaction().commit();
        session.close();
    }

    public void eliminarLiga(Long id) {
        Session session = Entrada.getSessionFactory().openSession();
        session.beginTransaction();
        Liga liga = session.get(Liga.class, id);
        if (liga != null) {
            session.delete(liga);
        }
        session.getTransaction().commit();
        session.close();
    }
}
