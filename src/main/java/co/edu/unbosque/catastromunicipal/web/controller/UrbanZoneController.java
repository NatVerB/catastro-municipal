package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.UrbanZone;
import co.edu.unbosque.catastromunicipal.domain.service.UrbanZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/urbanzone")
public class UrbanZoneController {
    @Autowired
    private UrbanZoneService urbanZoneService;

    @GetMapping("/allurbanzones")
    public List<UrbanZone> getAllUrbanZones(){
        return urbanZoneService.getAllUrbanZones();
    }
    @GetMapping("/urbanzones/byname/{id}")
    public List<UrbanZone> getUrbanZoneByName(@PathVariable("id") String name){
        return urbanZoneService.getUrbanZoneByName(name);
    }
    @DeleteMapping("/deleteurbanzone/byname")
    public void deleteUrbanZoneByName(String name){
        urbanZoneService.deleteUrbanZoneByName(name);
    }
    @PostMapping("/addurbanzone")
    public  UrbanZone saveUrbanZone(UrbanZone urbanZone){
        return urbanZoneService.saveUrbanZone(urbanZone);
    }
    @PostMapping("/updateurbanzone")
    public UrbanZone updateUrbanZone(UrbanZone urbanZone){
        return urbanZoneService.updateUrbanZone(urbanZone);
    }
}
