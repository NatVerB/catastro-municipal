package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.PrivateHouse;

import java.util.List;

public interface PrivateHouseRepository {
    List<PrivateHouse> getAllPrivateHouses();
    List<PrivateHouse> getPrivateHousesByNumber(Integer number);
    List<PrivateHouse> getPrivateHousesByStreet(String street);
    void deletePrivateHouseByNumber(Integer number);
    void deletePrivateHouseByStreet(String street);
    PrivateHouse savePrivateHouse(PrivateHouse privateHouse);
    PrivateHouse updatePrivateHouse(PrivateHouse privateHouse);
}
