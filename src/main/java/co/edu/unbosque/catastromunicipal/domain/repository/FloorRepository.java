package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.Floor;

import java.util.List;

public interface FloorRepository {
    List<Floor> getAllFloors();
    List<Floor> getFloorsByNumber(Integer number);
    List<Floor> getFloorsByStreet(String street);
    List<Floor> getFloorsByStair(Character stair);
    List<Floor> getFloorsByLevel(Integer level);
    List<Floor> getFloorsByDoor(String door);
    void deleteFloorByNumber(Integer number);
    void deleteFloorByStreet(String street);
    void deleteFloorByStair(Character stair);
    void deleteFloorByLevel(Integer level);
    void deleteFloorByDoor(String door);
    Floor saveFloor(Floor floor);
    Floor updateFloor(Floor floor);
}
