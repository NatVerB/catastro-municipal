package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasas;
import co.edu.unbosque.catastromunicipal.persistence.entity.Persona;
import co.edu.unbosque.catastromunicipal.persistence.entity.Piso;
import co.edu.unbosque.catastromunicipal.persistence.entity.PisoPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PisoCrudRepository extends CrudRepository<Piso, PisoPK> {
    public Iterable<Piso> findAll();
    public List<Piso> findAllById(PisoPK pisoPK);
}
