package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    Person save(Person person);
    List<Person> getAllPersons();
    Optional<Person> getById(Integer id);
    void deleteById(Integer id);
    void update(Integer dni, String odHouse);
}
