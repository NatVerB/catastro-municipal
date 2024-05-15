package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonaCrudRepository extends CrudRepository<Persona, Integer> {
    public Optional<Persona> findById(Long id);
    public void deleteById(Long id);
}
