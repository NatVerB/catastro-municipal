package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.Piso;
import co.edu.unbosque.catastromunicipal.persistence.entity.PisoPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PisoCrudRepository extends CrudRepository<Piso, PisoPK> {
}
