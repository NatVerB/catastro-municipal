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
        return personRepository.getById(id);
    }

    public boolean deleteById(Integer id) {
        if (getById(id).isPresent()) {
            personRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public boolean update(Integer dni, String odHouse) {
        if (getById(dni).isPresent()) {
            personRepository.update(dni, odHouse);
            return true;
        } else {
            return false;
        }
    }

}
