package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "Vivienda", schema = "dbo")
public class Vivienda {
    @EmbeddedId
    private ViviendaPK id;

    @Column(name = "tipo_vivienda", length = 1)
    private Character tipo;

    @Column(name = "codigo_postal", length = 5)
    private Integer codigoPostal;

    @Column(name = "metros", length = 5)
    private Integer metrosCuadrados;

    @Column(name = "od_vivienda")
    private String odVivienda;

    @Column(name = "nombre_zona")
    private String nombreZona;



    //Relaciones
    //Relacion con zona urbana
    @ManyToOne
    @JoinColumn(name = "nombre_zona", referencedColumnName = "nombre_zona", insertable = false, updatable = false)
    private ZonaUrbana zonaUrbana;

    //Relacion con bloque casas
    @OneToOne(mappedBy = "vivienda", cascade = CascadeType.ALL, orphanRemoval = true)
    private BloqueCasas bloqueCasas;

    @OneToOne(mappedBy = "vivienda", cascade = CascadeType.ALL, orphanRemoval = true)
    private CasaParticular casaParticular;

    @OneToMany(mappedBy = "vivienda")
    private List<Persona> personas;


// Getters y setters


    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public ViviendaPK getId() {
        return id;
    }

    public void setId(ViviendaPK id) {
        this.id = id;
    }

    public BloqueCasas getBloqueCasas() {
        return bloqueCasas;
    }

    public void setBloqueCasas(BloqueCasas bloqueCasas) {
        this.bloqueCasas = bloqueCasas;
    }

    public CasaParticular getCasaParticular() {
        return casaParticular;
    }

    public void setCasaParticular(CasaParticular casaParticular) {
        this.casaParticular = casaParticular;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }


    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Integer getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Integer metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getOdVivienda() {
        return odVivienda;
    }

    public void setOdVivienda(String odVivienda) {
        this.odVivienda = odVivienda;
    }

    public ZonaUrbana getZonaUrbana() {
        return zonaUrbana;
    }

    public void setZonaUrbana(ZonaUrbana zonaUrbana) {
        this.zonaUrbana = zonaUrbana;
    }
}
