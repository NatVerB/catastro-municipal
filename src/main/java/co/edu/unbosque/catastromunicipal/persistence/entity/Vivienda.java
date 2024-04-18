package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Vivienda")
public class Vivienda {

    @EmbeddedId
    private ViviendaPK id;

    @Column(name = "tipo_vivienda")
    private String tipoVivienda;

    @Column(name = "codigo_postal")
    private Integer codigoPostal;

    private Integer metros;

    @ManyToOne
    @JoinColumn(name = "nombre_zona", insertable = false, updatable = false)
    private ZonaUrbana zonaUrbana;

    @OneToMany(mappedBy = "vivienda", insertable = false, updatable = false)
    private List<CasaParticular> CasasParticular;

    @OneToMany(mappedBy = "zonaUrbana")
    private List<BloqueCasas> bloquesCasas;


    @Column(name = "od_vivienda")
    private Long odVivienda;

    @Column(name = "nombre_zona")
    private String nombreZona;


    public ViviendaPK getId() {
        return id;
    }

    public void setId(ViviendaPK id) {
        this.id = id;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public Long getOdVivienda() {
        return odVivienda;
    }

    public void setOdVivienda(Long odVivienda) {
        this.odVivienda = odVivienda;
    }

    public Integer getMetros() {
        return metros;
    }

    public void setMetros(Integer metros) {
        this.metros = metros;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

}
