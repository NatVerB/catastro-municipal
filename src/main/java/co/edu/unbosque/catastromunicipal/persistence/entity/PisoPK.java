package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class PisoPK implements Serializable {
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "calle")
    private String calle;
    @Column(name = "escalera")
    private Character escalera;
    @Column(name = "planta")
    private Integer planta;
    @Column(name = "puerta")
    private String puerta;

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
