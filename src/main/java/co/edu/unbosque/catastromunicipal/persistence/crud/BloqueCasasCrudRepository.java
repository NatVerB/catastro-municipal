package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasasPK;
import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface BloqueCasasCrudRepository extends CrudRepository<BloqueCasas, BloqueCasasPK> {

}
