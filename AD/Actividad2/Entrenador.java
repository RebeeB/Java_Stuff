package model;

import jakarta.persistence.*;

@Entity (name = "entrenadores")
public class Entrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "calificación")
    private Double calificacion;

    @Column(name = "títulos")
    private int titulos;

    @OneToOne
    @JoinColumn(name = "id_equipo", unique = true)
    private Equipo equipo;


    public void setNombre(String nombre) {
    }

    public void setApellido(String apellido) {
    }

    public void setEdad(int edad) {
    }

    public void setEquipo(Equipo equipo) {
    }
}

