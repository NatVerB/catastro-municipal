package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.Floor;
import co.edu.unbosque.catastromunicipal.domain.service.FloorService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/floor")
@Transactional
public class FloorController {
    @Autowired
    private FloorService floorService;

    @GetMapping("/allfloors")
    public List<Floor> getAllFloors() {
        return floorService.getAllFloors();
    }

    @GetMapping("/floor/bynumber/{id}")
    public ResponseEntity<Floor> getFloorsByNumber(@PathVariable("id") Integer number) {
        return floorService.getFloorsByNumber(number).map(floors -> new ResponseEntity<>(floors, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/floor/bystreet/{id}")
    public ResponseEntity<Floor> getFloorsByStreet(@PathVariable("id") String street) {
        return floorService.getFloorsByStreet(street).map(floors -> new ResponseEntity<>(floors, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/floor/bystair/{id}")
    public ResponseEntity<Floor> getFloorsByStair(@PathVariable("id") Character stair) {
        return floorService.getFloorsByStair(stair).map(floors -> new ResponseEntity<>(floors, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/floor/bylevel/{id}")
    public ResponseEntity<Floor> getFloorsByLevel(@PathVariable("id") Integer level) {
        return floorService.getFloorsByLevel(level).map(floors -> new ResponseEntity<>(floors, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/floor/bydoor/{id}")
    public ResponseEntity<Floor> getFloorsByDoor(@PathVariable("id") String door) {
        return floorService.getFloorsByDoor(door).map(floors -> new ResponseEntity<>(floors, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/deletefloor/bynumber")
    public ResponseEntity<String> deleteFloor(Integer number, String street, Character stair, Integer level, String door) {
        if (floorService.deleteFloor(number, street, stair , level, door)) {
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Not Deleted", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addfloor")
    public ResponseEntity<Floor> saveFloor(Floor floor) {
        return new ResponseEntity<>(floorService.saveFloor(floor), HttpStatus.CREATED);
    }

    @PutMapping("/updatefloor")
    public ResponseEntity<String> updateFloor(Integer number, String street, Integer meters, String odFloor) {

        if (floorService.updateFloor(number, street, meters, odFloor)) {
            return new ResponseEntity<>("Updated", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Not Updated", HttpStatus.NOT_FOUND);
        }
    }
}
