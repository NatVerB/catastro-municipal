package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ZonaUrbana", schema = "dbo")
public class ZonaUrbana {
    @Id
    @Column(name = "nombre_zona")
    private String nombreZona;

    @Column(name = "od_zona")
    private String odZona;

    @OneToMany(mappedBy = "zonaUrbana")
    private List<Vivienda> vivienda;

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public String getOdZona() {
        return odZona;
    }

    public void setOdZona(String odZona) {
        this.odZona = odZona;
    }

    public List<Vivienda> getVivienda() {
        return vivienda;
    }

    public void setVivienda(List<Vivienda> viviendas) {
        this.vivienda = viviendas;
    }
}
