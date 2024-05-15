package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Piso")
public class Piso {
    @EmbeddedId
    private PisoPK id;

    @Column(name = "metros_p")
    private Integer metrosP;

    @Column(name = "od_piso")
    private String odPiso;


    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "calle", referencedColumnName = "calle", updatable = false, insertable = false),
            @JoinColumn(name = "numero", referencedColumnName = "numero", updatable = false, insertable = false)
    })
    private BloqueCasas bloqueCasas;


    @ManyToOne
    @JoinColumn(name = "dni_p", referencedColumnName = "dni")
    private Persona persona;

    @OneToOne(mappedBy = "piso", cascade =  CascadeType.ALL, orphanRemoval = true)
    private HabitaPiso habitaPiso;

    public PisoPK getId() {
        return id;
    }

    public Integer getMetrosP() {
        return metrosP;
    }

    public void setMetrosP(Integer metrosP) {
        this.metrosP = metrosP;
    }

    public String getOdPiso() {
        return odPiso;
    }

    public void setOdPiso(String odPiso) {
        this.odPiso = odPiso;
    }



    public BloqueCasas getBloqueCasas() {
        return bloqueCasas;
    }

    public void setBloqueCasas(BloqueCasas bloqueCasas) {
        this.bloqueCasas = bloqueCasas;
    }

    public HabitaPiso getHabitaPiso() {
        return habitaPiso;
    }

    public void setHabitaPiso(HabitaPiso habitaPiso) {
        this.habitaPiso = habitaPiso;
    }

    public void setId(PisoPK id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
