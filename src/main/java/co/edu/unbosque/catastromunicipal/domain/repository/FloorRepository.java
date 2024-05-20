package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.Floor;

import java.util.List;
import java.util.Optional;

public interface FloorRepository {
    List<Floor> getAllFloors();
    Optional<List<Floor>> getFloorsByNumber(Integer number);
    Optional<List<Floor>>  getFloorsByStreet(String street);
    Optional<List<Floor>>  getFloorsByStair(Character stair);
    Optional<List<Floor>>  getFloorsByLevel(Integer level);
    Optional<List<Floor>>  getFloorsByDoor(String door);
    void deleteFloorByNumber(Integer number);
    void deleteFloorByStreet(String street);
    void deleteFloorByStair(Character stair);
    void deleteFloorByLevel(Integer level);
    void deleteFloorByDoor(String door);
    Floor saveFloor(Floor floor);
    Floor updateFloor(Floor floor);
}
