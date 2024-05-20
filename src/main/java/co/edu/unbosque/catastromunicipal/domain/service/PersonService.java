package co.edu.unbosque.catastromunicipal.domain.service;

import co.edu.unbosque.catastromunicipal.domain.Person;
import co.edu.unbosque.catastromunicipal.domain.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public List<Person> getAllPersons() {
        return personRepository.getAllPersons();
    }

    public Optional<Person> getById(Integer id) {
        return Optional.of(personRepository.getById(id));
    }

    public boolean deleteById(Integer id) {
        if (getById(id).isPresent()) {
            personRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public boolean update(Person person) {
        if (getById(person.getId()).isPresent()) {
            personRepository.update(person);
            return true;
        } else {
            return false;
        }
    }

}
