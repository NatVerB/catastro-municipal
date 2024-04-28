package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface PersonaCrudRepository extends CrudRepository<Persona, Integer> {
    public Optional<Persona> findById(Integer id);
    public Iterable<Persona> findAll();
    public void deleteById(Integer id);
}
