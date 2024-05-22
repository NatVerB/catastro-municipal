package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.Person;
import co.edu.unbosque.catastromunicipal.domain.service.PersonService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@Transactional
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/addperson")
    public ResponseEntity<Person> save(Person person){
            return new ResponseEntity<>(personService.save(person), HttpStatus.CREATED);

    }
    @GetMapping("/allpeople")
    public ResponseEntity<List<Person>> getAllPersons(){
        return new ResponseEntity<>(personService.getAllPersons(), HttpStatus.OK);
    }

    @GetMapping("/person/byid/{id}")
    public ResponseEntity<Person> getById(@PathVariable("id") Integer id){
        return personService.getById(id).map(persona -> new ResponseEntity<>(persona, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("/deleteperson/byid")
    public ResponseEntity<String> deleteById(Integer id){
        if(personService.deleteById(id)){
            return new ResponseEntity<>("Person deleted", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Person not delete", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateperson")
    public ResponseEntity<String> update(Person person){

        if(personService.update(person)){
            return new ResponseEntity<>("Person updated", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Person not updated", HttpStatus.NOT_FOUND);
        }
    }
}
