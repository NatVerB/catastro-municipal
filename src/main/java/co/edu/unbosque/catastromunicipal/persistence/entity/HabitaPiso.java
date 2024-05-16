package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "HabitaPiso", schema = "dbo")
public class HabitaPiso {
    @Id
    private Integer dni;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni", updatable = false, insertable = false)
    private Persona persona;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "calle", referencedColumnName = "calle"),
            @JoinColumn(name = "numero", referencedColumnName = "numero"),
            @JoinColumn(name = "escalera", referencedColumnName = "escalera"),
            @JoinColumn(name = "planta", referencedColumnName = "planta"),
            @JoinColumn(name = "puerta", referencedColumnName = "puerta")
    })
    private Piso piso;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Piso getPiso() {
        return piso;
    }

    public void setPiso(Piso piso) {
        this.piso = piso;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }


}
