package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CasaParticular")
public class CasaParticular {
    @EmbeddedId
    private CasaParticularPK id;

    @Column(name = "metros_c")
    private Integer metrosC;

    @Column(name = "od_casa")
    private String odCasa;


    //Relaciones
    @ManyToOne
    @JoinColumn(name = "dni_cp", referencedColumnName = "dni")
    private Persona persona;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "calle", referencedColumnName = "calle", insertable = false, updatable = false),
            @JoinColumn(name = "numero", referencedColumnName = "numero", insertable = false, updatable = false)
    })
    private Vivienda vivienda;

    //getters y setters


    public CasaParticularPK getId() {
        return id;
    }

    public void setId(CasaParticularPK id) {
        this.id = id;
    }

    public Integer getMetrosC() {
        return metrosC;
    }

    public void setMetrosC(Integer metrosC) {
        this.metrosC = metrosC;
    }

    public String getOdCasa() {
        return odCasa;
    }

    public void setOdCasa(String odCasa) {
        this.odCasa = odCasa;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

}
