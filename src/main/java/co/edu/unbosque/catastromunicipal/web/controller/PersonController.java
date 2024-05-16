package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.Person;
import co.edu.unbosque.catastromunicipal.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/addperson")
    public Person save(Person person){
        return personService.save(person);
    }
    @GetMapping("/allpeople")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }
    @GetMapping("/person/byid/{id}")
    public Person getById(@PathVariable("id") Integer id){
        return personService.getById(id);
    }
    @DeleteMapping("/deleteperson/byid")
    public void deleteById(Integer id){
        personService.deleteById(id);
    }
    @PostMapping("/updateperson")
    public Person update(Person person){
        return personService.update(person);
    }
}
