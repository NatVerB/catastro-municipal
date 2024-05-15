package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ViviendaPK implements Serializable {

    private Integer numero;
    private String calle;

    public ViviendaPK() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViviendaPK that = (ViviendaPK) o;
        return numero == that.numero && Objects.equals(calle, that.calle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, calle);
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
