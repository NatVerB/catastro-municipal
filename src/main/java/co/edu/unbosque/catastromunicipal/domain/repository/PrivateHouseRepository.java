package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.PrivateHouse;

import java.util.List;
import java.util.Optional;

public interface PrivateHouseRepository {
    List<PrivateHouse> getAllPrivateHouses();
    Optional<List<PrivateHouse>> getPrivateHousesByNumber(Integer number);
    Optional<List<PrivateHouse>> getPrivateHousesByStreet(String street);
    void deletePrivateHouseByNumber(Integer number);
    void deletePrivateHouseByStreet(String street);
    PrivateHouse savePrivateHouse(PrivateHouse privateHouse);
    PrivateHouse updatePrivateHouse(PrivateHouse privateHouse);
}
