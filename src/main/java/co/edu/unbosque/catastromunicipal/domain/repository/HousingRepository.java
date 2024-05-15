package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.Housing;

import java.util.List;

public interface HousingRepository {
    List<Housing> getAllHousings();
    List<Housing> getHousingByNumber(Integer number);
    List<Housing> getHousingByStreet(String street);
    void deleteHousingByNumber(Integer number);
    void deleteHousingByStreet(String street);
    Housing saveHousing(Housing housing);
    Housing updateHousing(Housing housing);
}
