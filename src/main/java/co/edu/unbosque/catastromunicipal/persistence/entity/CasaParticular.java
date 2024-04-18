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
    private Long odCasa;

    @Column(name = "dni_cp")
    private Integer dniCp;

    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "calle", insertable = false, updatable = false),
            @JoinColumn(name = "numero", insertable = false, updatable = false)
    })
    private Vivienda vivienda;

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

    public Long getOdCasa() {
        return odCasa;
    }

    public void setOdCasa(Long odCasa) {
        this.odCasa = odCasa;
    }

    public Integer getDniCp() {
        return dniCp;
    }

    public void setDniCp(Integer dniCp) {
        this.dniCp = dniCp;
    }
}
