package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.FlatResident;
import co.edu.unbosque.catastromunicipal.domain.service.FlatResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flatresident")
public class FlatResidentController {
    @Autowired
    private FlatResidentService flatResidentService;

    @GetMapping("/allflatresidents")
    public List<FlatResident> getAllFlatResidents(){
        return flatResidentService.getAllFlatResidents();
    }

    @GetMapping("/flatresidents/bydni/{id}")
    public List<FlatResident> getFlatResidentsByDni(@PathVariable("id") Integer dni){
        return flatResidentService.getFlatResidentsByDni(dni);
    }

    @DeleteMapping("/deleteflatresident/bydni")
    public void deleteFlatResidentByDni(Integer dni){
            flatResidentService.deleteFlatResidentByDni(dni);
    }

    @PostMapping("/addflatresident")
    public FlatResident saveFlatResident(FlatResident flatResident){
        return flatResidentService.saveFlatResident(flatResident);
    }
    @PostMapping("/updateflatresident")
    public  FlatResident updateFlatResident(FlatResident flatResident){
        return flatResidentService.updateFlatResident(flatResident);
    }
}
