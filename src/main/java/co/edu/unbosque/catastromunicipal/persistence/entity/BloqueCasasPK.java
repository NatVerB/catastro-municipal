package co.edu.unbosque.catastromunicipal.persistence.entity;

import java.io.Serializable;
import java.util.Objects;

public class BloqueCasasPK implements Serializable {
    private Integer numero;
    private String casa;

    public BloqueCasasPK() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BloqueCasasPK that = (BloqueCasasPK) o;
        return numero == that.numero && Objects.equals(casa, that.casa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, casa);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
}
