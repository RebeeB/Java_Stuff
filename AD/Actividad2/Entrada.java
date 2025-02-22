package utils;

import lombok.Getter;
import model.Liga;
import model.Equipo;
import model.Jugador;
import model.Entrenador;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Entrada {

    public static void main(String[] args) {
        try {
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml")
                    .build();

            SessionFactory sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(Liga.class)
                    .addAnnotatedClass(Equipo.class)
                    .addAnnotatedClass(Jugador.class)
                    .addAnnotatedClass(Entrenador.class)
                    .buildMetadata()
                    .buildSessionFactory();
        } catch (Exception e) {
            System.err.println("Error al inicializar Hibernate: " + e);
            throw new ExceptionInInitializerError(e);
        }
    }


    public static SessionBuilder getSessionFactory() {
        return null;
    }
}

