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
    public ResponseEntity<List<Floor>> getFloorsByNumber(@PathVariable("id") Integer number) {
        return floorService.getFloorsByNumber(number).map(floors -> new ResponseEntity<>(floors, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/floor/bystreet/{id}")
    public ResponseEntity<List<Floor>> getFloorsByStreet(@PathVariable("id") String street) {
        return floorService.getFloorsByStreet(street).map(floors -> new ResponseEntity<>(floors, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/floor/bystair/{id}")
    public ResponseEntity<List<Floor>> getFloorsByStair(@PathVariable("id") Character stair) {
        return floorService.getFloorsByStair(stair).map(floors -> new ResponseEntity<>(floors, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/floor/bylevel/{id}")
    public ResponseEntity<List<Floor>> getFloorsByLevel(@PathVariable("id") Integer level) {
        return floorService.getFloorsByLevel(level).map(floors -> new ResponseEntity<>(floors, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/floor/bydoor/{id}")
    public ResponseEntity<List<Floor>> getFloorsByDoor(@PathVariable("id") String door) {
        return floorService.getFloorsByDoor(door).map(floors -> new ResponseEntity<>(floors, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/deletefloor/bynumber")
    public ResponseEntity<String> deleteFloorByNumber(Integer number) {
        if (floorService.deleteFloorByNumber(number)) {
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Not Deleted", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deletefloor/bystreet")
    public ResponseEntity<String> deleteFloorByStreet(String street) {
        if (floorService.deleteFloorByStreet(street)) {
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Not Deleted", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deletefloor/bystair")
    public ResponseEntity<String> deleteFloorByStair(Character stair) {
        if (floorService.deleteFloorByStair(stair)) {
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Not Deleted", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deletefloor/bylevel")
    public ResponseEntity<String> deleteFloorByLevel(Integer level) {
        if (floorService.deleteFloorByLevel(level)) {
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Not Deleted", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deletefloor/bydoor")
    public ResponseEntity<String> deleteFloorByDoor(String door) {
        if (floorService.deleteFloorByDoor(door)) {
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
    public ResponseEntity<String> updateFloor(Floor floor) {

        if (floorService.updateFloor(floor)) {
            return new ResponseEntity<>("Updated", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Not Updated", HttpStatus.NOT_FOUND);
        }
    }
}
