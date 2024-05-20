package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "HabitaPiso", schema = "dbo")
public class HabitaPiso {
    @Id
    private Integer dni;

    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "escalera")
    private Character escalera;
    @Column(name = "planta")
    private Integer planta;
    @Column(name = "puerta")
    private String puerta;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni", updatable = false, insertable = false)
    private Persona persona;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "calle", referencedColumnName = "calle", insertable = false, updatable = false),
            @JoinColumn(name = "numero", referencedColumnName = "numero", insertable = false, updatable = false),
            @JoinColumn(name = "escalera", referencedColumnName = "escalera", insertable = false, updatable = false),
            @JoinColumn(name = "planta", referencedColumnName = "planta", insertable = false, updatable = false),
            @JoinColumn(name = "puerta", referencedColumnName = "puerta", insertable = false, updatable = false)
    })
    private Piso piso;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
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


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Character getEscalera() {
        return escalera;
    }

    public void setEscalera(Character escalera) {
        this.escalera = escalera;
    }

    public Integer getPlanta() {
        return planta;
    }

    public void setPlanta(Integer planta) {
        this.planta = planta;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }
}
