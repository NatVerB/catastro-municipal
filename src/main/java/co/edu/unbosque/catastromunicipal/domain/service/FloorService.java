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

    public Optional<Floor> getFloorsByNumber(Integer number) {
        return floorRepository.getFloorsByNumber(number);
    }

    public Optional<Floor> getFloorsByStreet(String street) {
        return floorRepository.getFloorsByStreet(street);
    }

    public Optional<Floor> getFloorsByStair(Character stair) {
        return floorRepository.getFloorsByStair(stair);
    }

    public Optional<Floor> getFloorsByLevel(Integer level) {
        return floorRepository.getFloorsByLevel(level);
    }

    public Optional<Floor> getFloorsByDoor(String door) {
        return floorRepository.getFloorsByDoor(door);
    }

    public boolean deleteFloor(Integer number, String street, Character stair, Integer level, String door) {
        if (getFloorsByNumber(number).isPresent()) {
            floorRepository.deleteFloor(number, street, stair, level, door);
            return true;
        } else {
            return false;
        }
    }

    public Floor saveFloor(Floor floor) {
        return floorRepository.saveFloor(floor);
    }

    public boolean updateFloor(Integer number, String street, Integer meters, String odFloor) {
        if (getFloorsByNumber(number).isPresent()) {
            floorRepository.updateFloor(number, street, meters, odFloor);
            return true;
        } else {
            return false;
        }
    }
}
