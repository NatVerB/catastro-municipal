package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ZonaUrbana")
public class ZonaUrbana {

    @Id
    @Column(name = "nombre_zona")
    private String nombreZona;

    @Column(name = "od_zona")
    private Long odZona;

    @OneToMany(mappedBy = "zonaUrbana")
    private List<Vivienda> viviendas;

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public Long getOdZona() {
        return odZona;
    }

    public void setOdZona(Long odZona) {
        this.odZona = odZona;
    }
}
