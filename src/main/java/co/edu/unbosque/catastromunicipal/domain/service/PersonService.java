package co.edu.unbosque.catastromunicipal.domain.service;

import co.edu.unbosque.catastromunicipal.domain.Person;
import co.edu.unbosque.catastromunicipal.domain.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person){
        return personRepository.save(person);
    }
    public List<Person> getAllPersons(){
        return personRepository.getAllPersons();
    }
    public Person getById(Integer id){
        return personRepository.getById(id);
    }
    public void deleteById(Integer id){
        if(getById(id) != null){
            personRepository.deleteById(id);
        }
    }
    public Person update(Person person){
        return personRepository.update(person);
    }

}
