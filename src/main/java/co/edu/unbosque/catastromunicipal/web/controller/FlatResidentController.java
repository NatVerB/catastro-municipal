package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.FlatResident;
import co.edu.unbosque.catastromunicipal.domain.service.FlatResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flatresident")
public class FlatResidentController {
    @Autowired
    private FlatResidentService flatResidentService;

    @GetMapping("/allflatresidents")
    public ResponseEntity<List<FlatResident>> getAllFlatResidents(){
        return new ResponseEntity<>(flatResidentService.getAllFlatResidents(), HttpStatus.OK);
    }

    @GetMapping("/flatresidents/bydni/{id}")
    public ResponseEntity<List<FlatResident>> getFlatResidentsByDni(@PathVariable("id") Integer dni){
        return flatResidentService.getFlatResidentsByDni(dni).map(flats -> new ResponseEntity<>(flats, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/deleteflatresident/bydni")
    public ResponseEntity<String> deleteFlatResidentByDni(Integer dni){
        if(flatResidentService.deleteFlatResidentByDni(dni)){
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Not Deleted", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addflatresident")
    public ResponseEntity<FlatResident> saveFlatResident(FlatResident flatResident){
        return new ResponseEntity<>(flatResidentService.saveFlatResident(flatResident), HttpStatus.CREATED);
    }
    @PutMapping("/updateflatresident")
    public  ResponseEntity<String> updateFlatResident(FlatResident flatResident){
        if(flatResidentService.updateFlatResident(flatResident)){
            return new ResponseEntity<>("Updated", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Not Updated", HttpStatus.NOT_FOUND);
        }
    }
}
