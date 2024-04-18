package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CasaParticularPK implements Serializable {

    private String calle; //PK

    private Integer numero; //PK

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
