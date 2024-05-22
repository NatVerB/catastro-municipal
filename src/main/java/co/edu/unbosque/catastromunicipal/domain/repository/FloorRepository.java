package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.Floor;

import java.util.List;
import java.util.Optional;

public interface FloorRepository {
    List<Floor> getAllFloors();
    Optional<Floor> getFloorsByNumber(Integer number);
    Optional<Floor>  getFloorsByStreet(String street);
    Optional<Floor>  getFloorsByStair(Character stair);
    Optional<Floor>  getFloorsByLevel(Integer level);
    Optional<Floor>  getFloorsByDoor(String door);
    void deleteFloor(Integer number, String street, Character stair, Integer level, String door);
    Floor saveFloor(Floor floor);
    void updateFloor(Integer number, String street, Integer meters, String odFloor);
}
