package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "BloqueCasas")
public class BloqueCasas {

    @EmbeddedId
    private BloqueCasasPK id;

    @Column(name = "metros_b")
    private Integer metrosB;

    @Column(name = "od_bloque")
    private Long odBloque;

    @OneToOne
    @JoinColumn(name = "calle", insertable = false, updatable = false)
    private Vivienda calle;

    @ManyToOne
    @JoinColumn(name = "numero", insertable = false, updatable = false)
    private Vivienda numero;

    public BloqueCasasPK getId() {
        return id;
    }

    public void setId(BloqueCasasPK id) {
        this.id = id;
    }

    public Integer getMetrosB() {
        return metrosB;
    }

    public void setMetrosB(Integer metrosB) {
        this.metrosB = metrosB;
    }

    public Long getOdBloque() {
        return odBloque;
    }

    public void setOdBloque(Long odBloque) {
        this.odBloque = odBloque;
    }
}
