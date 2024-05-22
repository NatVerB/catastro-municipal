package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.PrivateHouse;
import co.edu.unbosque.catastromunicipal.domain.service.PrivateHouseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/privatehouse")
@Transactional
public class PrivateHouseController {
    @Autowired
    private PrivateHouseService privateHouseService;

    @GetMapping("/allprivatehouses")
    public ResponseEntity<List<PrivateHouse>> getAllPrivateHouses(){
        return new ResponseEntity<>(privateHouseService.getAllPrivateHouses(), HttpStatus.OK);
    }
    @GetMapping("/privatehouses/bynumber/{id}")
    public ResponseEntity<PrivateHouse> getPrivateHousesByNumber(@PathVariable("id") Integer number){
        return privateHouseService.getPrivateHousesByNumber(number).map(privatehouses -> new ResponseEntity<>(privatehouses, HttpStatus.OK)).orElse((new ResponseEntity<>(HttpStatus.NOT_FOUND)));
    }
    @GetMapping("/privatehouses/bystreet/{id}")
    public ResponseEntity<PrivateHouse> getPrivateHousesByStreet(@PathVariable("id") String street){
        return privateHouseService.getPrivateHousesByStreet(street).map(privatehouses -> new ResponseEntity<>(privatehouses, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/deleteprivatehouse")
    public ResponseEntity<String> deletePrivateHouse(Integer number, String street){
        if(privateHouseService.deletePrivateHouse(number, street)){
            return new ResponseEntity<>("Deleted",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Not Deleted",HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addprivatehouse")
    public ResponseEntity<PrivateHouse> savePrivateHouse(PrivateHouse privateHouse){
        return new ResponseEntity<>(privateHouseService.savePrivateHouse(privateHouse), HttpStatus.CREATED);
    }
    @PutMapping("/updateprivatehouse")
    public ResponseEntity<String> updatePrivateHouse(Integer number, String street, String odHouse){
        if (privateHouseService.updatePrivateHouse(number, street, odHouse)){
            return new ResponseEntity<>("Updated",HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Not Updated",HttpStatus.NOT_MODIFIED);
        }
    }
}

