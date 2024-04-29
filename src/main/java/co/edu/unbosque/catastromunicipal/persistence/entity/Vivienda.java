package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

@Entity
@IdClass(ViviendaPK.class)
public class Vivienda {
    @Id
    private Integer numero;

    @Id
    private String calle;

    @Column(name = "tipo_vivienda", length = 1)
    private String tipo;

    @Column(name = "codigo_postal", length = 5)
    private Integer codigoPostal;

    @Column(name = "metros", length = 5)
    private Integer metrosCuadrados;

    @Column(name = "od_vivienda")
    private String OdVivienda;

    @ManyToOne
    @JoinColumn(name = "nombre_zona", referencedColumnName = "nombre_zona")
    private ZonaUrbana zona;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return OdVivienda;
    }

    public void setOdVivienda(String odVivienda) {
        OdVivienda = odVivienda;
    }

    public ZonaUrbana getZona() {
        return zona;
    }

    public void setZona(ZonaUrbana zona) {
        this.zona = zona;
    }
}
