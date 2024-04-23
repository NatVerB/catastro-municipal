package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Piso")
@IdClass(PisoPK.class)
public class Piso {
    @Id
    @ManyToOne
    @JoinColumn(name = "calle", referencedColumnName = "calle", updatable = false, insertable = false)
    private BloqueCasas calle;
    @Id
    @ManyToOne
    @JoinColumn(name = "numero", referencedColumnName = "numero", updatable = false, insertable = false)
    private  BloqueCasas numero;
    @Id
    @Column(name = "escalera")
    private String escalera;
    @Id
    @Column(name = "planta")
    private int plantaPiso;
    @Id
    @Column(name = "puerta")
    private String puerta;
    @ManyToOne
    @JoinColumn(name = "dni_p", referencedColumnName = "dni")
    private Persona persona;
}
