package co.edu.unbosque.catastromunicipal.persistence;


import co.edu.unbosque.catastromunicipal.domain.Person;
import co.edu.unbosque.catastromunicipal.domain.repository.PersonRepository;
import co.edu.unbosque.catastromunicipal.persistence.crud.PersonaCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.Persona;
import co.edu.unbosque.catastromunicipal.persistence.mapper.PersonMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonaRepository implements PersonRepository {
    private PersonaCrudRepository personaCrudRepository;
    private PersonMapper mapper;

    @Override
    public Person save(Person person) {
        Persona persona = mapper.toPersona(person);
        return mapper.toPerson(personaCrudRepository.save(persona));
    }

    @Override
    public List<Person> getAllPersons() {
        List<Persona> personas = (List<Persona>) personaCrudRepository.findAll();
        return mapper.toPersons(personas);
    }

    @Override
    public Person getById(Integer id) {
        Persona personas = (Persona) personaCrudRepository.findPersonaById(id);
        return mapper.toPerson(personas);
    }

    @Override
    public void deleteById(Integer id) {
        personaCrudRepository.deleteById(id);
    }

    @Override
    public Person update(Person person) {
        Persona persona = mapper.toPersona(person);
        if (persona.getId() != null && personaCrudRepository.existsById(persona.getId())) {
            return mapper.toPerson(personaCrudRepository.save(persona));
        } else {
            throw new RuntimeException("No se puede actualizar Persona porque no existe en la base de datos.");
        }
    }
}
