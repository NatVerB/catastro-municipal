package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BloqueCasasPK implements Serializable {
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "calle")
    private String calle;

    public BloqueCasasPK(){

    }

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
}
