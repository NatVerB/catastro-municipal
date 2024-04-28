package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "HabitaPiso")
public class HabitaPiso {
    @Id
    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni", updatable = false, insertable = false)
    private Persona persona;

    @OneToOne
    @JoinColumn(name = "calle", referencedColumnName = "calle")
    private Piso calle;

    @OneToOne
    @JoinColumn(name = "numero", referencedColumnName = "numero")
    private Piso numero;

    @OneToOne
    @JoinColumn(name = "escalera", referencedColumnName = "escalera")
    private Piso escalera;

    @OneToOne
    @JoinColumn(name = "planta", referencedColumnName = "planta")
    private Piso planta;

    @OneToOne
    @JoinColumn(name = "puerta", referencedColumnName = "puerta")
    private Piso puerta;
}
