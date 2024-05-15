package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.Person;

import java.util.List;

public interface PersonRepository {
    Person save(Person person);
    List<Person> getAllPersons();
    Person getById(Integer id);
    void deleteById(Integer id);
    Person update(Person person);
}
