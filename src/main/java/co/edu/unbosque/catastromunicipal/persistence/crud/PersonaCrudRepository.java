package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PersonaCrudRepository extends CrudRepository<Persona, Integer> {
    public void deleteById(Integer id);
    public Persona findPersonaById(Integer id);
}
