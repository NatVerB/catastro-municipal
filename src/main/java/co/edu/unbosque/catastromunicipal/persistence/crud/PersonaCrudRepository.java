package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.Persona;
import org.springframework.data.repository.CrudRepository;


public interface PersonaCrudRepository extends CrudRepository<Persona, Integer> {
    public Persona findPersonaById(Integer id);
}
