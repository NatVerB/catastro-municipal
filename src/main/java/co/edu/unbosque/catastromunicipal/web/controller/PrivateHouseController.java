package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.PrivateHouse;
import co.edu.unbosque.catastromunicipal.domain.service.PrivateHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/privatehouse")
public class PrivateHouseController {
    @Autowired
    private PrivateHouseService privateHouseService;

    @GetMapping("/allprivatehouses")
    public List<PrivateHouse> getAllPrivateHouses(){
        return privateHouseService.getAllPrivateHouses();
    }
    @GetMapping("/privatehouses/bynumber/{id}")
    public List<PrivateHouse> getPrivateHousesByNumber(@PathVariable("id") Integer number){
        return privateHouseService.getPrivateHousesByNumber(number);
    }
    @GetMapping("/privatehouses/bystreet/{id}")
    public List<PrivateHouse> getPrivateHousesByStreet(@PathVariable("id") String street){
        return privateHouseService.getPrivateHousesByStreet(street);
    }
    @DeleteMapping("/deleteprivatehouse/bynumber")
    public void deletePrivateHouseByNumber(Integer number){
        privateHouseService.deletePrivateHouseByNumber(number);
    }
    @DeleteMapping("/deleteprivatehouse/bystreet")
    public void deletePrivateHouseByStreet(String street){
        privateHouseService.deletePrivateHouseByStreet(street);
    }
    @PostMapping("/addprivatehouse")
    public PrivateHouse savePrivateHouse(PrivateHouse privateHouse){
        return privateHouseService.savePrivateHouse(privateHouse);
    }
    @PostMapping("/updateprivatehouse")
    public PrivateHouse updatePrivateHouse(PrivateHouse privateHouse){
        return privateHouseService.updatePrivateHouse(privateHouse);
    }
}
