package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.PrivateHouse;

import java.util.List;
import java.util.Optional;

public interface PrivateHouseRepository {
    List<PrivateHouse> getAllPrivateHouses();
    Optional<PrivateHouse> getPrivateHousesByNumber(Integer number);
    Optional<PrivateHouse> getPrivateHousesByStreet(String street);
    void deletePrivateHouse(Integer number, String street);
    PrivateHouse savePrivateHouse(PrivateHouse privateHouse);
    void updatePrivateHouse(Integer number, String street, String odHouse);
}
