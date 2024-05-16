package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.Floor;
import co.edu.unbosque.catastromunicipal.domain.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/floor")
public class FloorController {
    @Autowired
    private FloorService floorService;

    @GetMapping("/allfloors")
    public List<Floor> getAllFloors(){
        return floorService.getAllFloors();
    }
    @GetMapping("/floor/bynumber/{id}")
    public List<Floor> getFloorsByNumber(@PathVariable("id") Integer number){
        return floorService.getFloorsByNumber(number);
    }
    @GetMapping("/floor/bystreet/{id}")
    public List<Floor> getFloorsByStreet(@PathVariable("id") String street){
        return floorService.getFloorsByStreet(street);
    }
    @GetMapping("/floor/bystair/{id}")
    public List<Floor> getFloorsByStair(@PathVariable("id") Character stair){
        return floorService.getFloorsByStair(stair);
    }
    @GetMapping("/floor/bylevel/{id}")
    public List<Floor> getFloorsByLevel(@PathVariable("id") Integer level){
        return floorService.getFloorsByLevel(level);
    }
    @GetMapping("/floor/bydoor/{id}")
    public List<Floor> getFloorsByDoor(@PathVariable("id") String door){
        return floorService.getFloorsByDoor(door);
    }
    @DeleteMapping("/deletefloor/bynumber")
    public void deleteFloorByNumber(Integer number){
        floorService.deleteFloorByNumber(number);
    }
    @DeleteMapping("/deletefloor/bystreet")
    public void deleteFloorByStreet(String street){
        floorService.deleteFloorByStreet(street);
    }
    @DeleteMapping("/deletefloor/bystair")
    public void deleteFloorByStair(Character stair){
        floorService.deleteFloorByStair(stair);
    }
    @DeleteMapping("/deletefloor/bylevel")
    public void deleteFloorByLevel(Integer level){
        floorService.deleteFloorByLevel(level);
    }
    @DeleteMapping("/deletefloor/bydoor")
    public void deleteFloorByDoor(String door){
        floorService.deleteFloorByDoor(door);
    }

    @PostMapping("/addfloor")
    public Floor saveFloor(Floor floor){
        return floorService.saveFloor(floor);
    }
    @PostMapping("/updatefloor")
    public Floor updateFloor(Floor floor){
        return floorService.updateFloor(floor);
    }
}
