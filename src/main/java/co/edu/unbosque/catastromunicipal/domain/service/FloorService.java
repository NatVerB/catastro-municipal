package co.edu.unbosque.catastromunicipal.domain.service;

import co.edu.unbosque.catastromunicipal.domain.Floor;
import co.edu.unbosque.catastromunicipal.domain.repository.FloorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloorService {
    @Autowired
    private FloorRepository floorRepository;

    public List<Floor> getAllFloors(){
        return floorRepository.getAllFloors();
    }
    public List<Floor> getFloorsByNumber(Integer number){
        return floorRepository.getFloorsByNumber(number);
    }
    public List<Floor> getFloorsByStreet(String street){
        return floorRepository.getFloorsByStreet(street);
    }
    public List<Floor> getFloorsByStair(Character stair){
        return floorRepository.getFloorsByStair(stair);
    }
    public List<Floor> getFloorsByLevel(Integer level){
        return floorRepository.getFloorsByLevel(level);
    }
    public List<Floor> getFloorsByDoor(String door){
        return floorRepository.getFloorsByDoor(door);
    }
    public void deleteFloorByNumber(Integer number){
        if(!getFloorsByNumber(number).isEmpty()){
            floorRepository.deleteFloorByNumber(number);
        }
    }
    public void deleteFloorByStreet(String street){
        if(!getFloorsByStreet(street).isEmpty()){
            floorRepository.deleteFloorByStreet(street);
        }
    }
    public void deleteFloorByStair(Character stair){
        if(!getFloorsByStair(stair).isEmpty()){
            floorRepository.deleteFloorByStair(stair);
        }
    }
    public void deleteFloorByLevel(Integer level){
        if(!getFloorsByLevel(level).isEmpty()){
            floorRepository.deleteFloorByLevel(level);
        }
    }
    public void deleteFloorByDoor(String door){
        if(!getFloorsByDoor(door).isEmpty()){
            floorRepository.deleteFloorByDoor(door);
        }
    }

    public Floor saveFloor(Floor floor){
        return floorRepository.saveFloor(floor);
    }
    public Floor updateFloor(Floor floor){
        return floorRepository.updateFloor(floor);
    }
}
