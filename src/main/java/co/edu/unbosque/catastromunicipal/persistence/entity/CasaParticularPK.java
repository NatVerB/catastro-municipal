package co.edu.unbosque.catastromunicipal.persistence.entity;

import java.io.Serializable;
import java.util.Objects;

public class CasaParticularPK implements Serializable {
    public int numero;
    public String calle;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CasaParticularPK that = (CasaParticularPK) o;
        return numero == that.numero && Objects.equals(calle, that.calle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, calle);
    }
}
