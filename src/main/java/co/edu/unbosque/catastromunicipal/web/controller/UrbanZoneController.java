package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.UrbanZone;
import co.edu.unbosque.catastromunicipal.domain.service.UrbanZoneService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/urbanzone")
@Transactional
public class UrbanZoneController {
    @Autowired
    private UrbanZoneService urbanZoneService;

    @GetMapping("/allurbanzones")
    public ResponseEntity<List<UrbanZone>> getAllUrbanZones() {
        return new ResponseEntity<>(urbanZoneService.getAllUrbanZones(), HttpStatus.OK);
    }

    @GetMapping("/urbanzones/byname/{id}")
    public ResponseEntity<List<UrbanZone>> getUrbanZoneByName(@PathVariable("id") String name) {
        return urbanZoneService.getUrbanZoneByName(name).map(urbanZones -> new ResponseEntity<>(urbanZones, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/deleteurbanzone/byname")
    public ResponseEntity<String> deleteUrbanZoneByName(String name) {
        if (urbanZoneService.deleteUrbanZoneByName(name)) {
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Not Deleted", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addurbanzone")
    public ResponseEntity<UrbanZone> saveUrbanZone(UrbanZone urbanZone) {
        return new ResponseEntity<>(urbanZoneService.saveUrbanZone(urbanZone), HttpStatus.CREATED);
    }

    @PutMapping("/updateurbanzone")
    public ResponseEntity<String> updateUrbanZone(UrbanZone urbanZone) {
        if (urbanZoneService.updateUrbanZone(urbanZone)) {
            return new ResponseEntity<>("Updated", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Not Updated", HttpStatus.NOT_MODIFIED);
        }
    }
}
