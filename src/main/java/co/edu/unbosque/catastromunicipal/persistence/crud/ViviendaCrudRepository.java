package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.Vivienda;
import co.edu.unbosque.catastromunicipal.persistence.entity.ViviendaPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViviendaCrudRepository extends CrudRepository<Vivienda, ViviendaPK> {
}
