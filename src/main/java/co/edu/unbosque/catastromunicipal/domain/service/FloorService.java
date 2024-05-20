package co.edu.unbosque.catastromunicipal.domain.service;

import co.edu.unbosque.catastromunicipal.domain.Floor;
import co.edu.unbosque.catastromunicipal.domain.repository.FloorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FloorService {
    @Autowired
    private FloorRepository floorRepository;

    public List<Floor> getAllFloors() {
        return floorRepository.getAllFloors();
    }

    public Optional<List<Floor>> getFloorsByNumber(Integer number) {
        return floorRepository.getFloorsByNumber(number);
    }

    public Optional<List<Floor>> getFloorsByStreet(String street) {
        return floorRepository.getFloorsByStreet(street);
    }

    public Optional<List<Floor>> getFloorsByStair(Character stair) {
        return floorRepository.getFloorsByStair(stair);
    }

    public Optional<List<Floor>> getFloorsByLevel(Integer level) {
        return floorRepository.getFloorsByLevel(level);
    }

    public Optional<List<Floor>> getFloorsByDoor(String door) {
        return floorRepository.getFloorsByDoor(door);
    }

    public boolean deleteFloorByNumber(Integer number) {
        if (getFloorsByNumber(number).isPresent()) {
            floorRepository.deleteFloorByNumber(number);
            return true;
        }else{
            return false;
        }
    }

    public boolean deleteFloorByStreet(String street) {
        if (getFloorsByStreet(street).isPresent()) {
            floorRepository.deleteFloorByStreet(street);
            return true;
        }else{
            return false;
        }
    }

    public boolean deleteFloorByStair(Character stair) {
        if (getFloorsByStair(stair).isPresent()) {
            floorRepository.deleteFloorByStair(stair);
            return true;
        }else{
            return false;
        }
    }

    public boolean deleteFloorByLevel(Integer level) {
        if (getFloorsByLevel(level).isPresent()) {
            floorRepository.deleteFloorByLevel(level);
            return true;
        }else{
            return false;
        }
    }

    public boolean deleteFloorByDoor(String door) {
        if (getFloorsByDoor(door).isPresent()) {
            floorRepository.deleteFloorByDoor(door);
            return true;
        }else{
            return false;
        }
    }

    public Floor saveFloor(Floor floor) {
        return floorRepository.saveFloor(floor);
    }

    public boolean updateFloor(Floor floor) {
        if (getFloorsByStreet(floor.getStreet()).isPresent() && getFloorsByDoor(floor.getDoor()).isPresent() && getFloorsByNumber(floor.getNumber()).isPresent() && getFloorsByLevel(floor.getLevel()).isPresent()&& getFloorsByStair(floor.getStair()).isPresent()) {
            floorRepository.updateFloor(floor);
            return true;
        }else{
            return false;
        }
    }
}
