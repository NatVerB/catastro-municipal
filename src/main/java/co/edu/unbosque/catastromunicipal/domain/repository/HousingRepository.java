package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.Housing;

import java.util.List;
import java.util.Optional;

public interface HousingRepository {
    List<Housing> getAllHousings();
    Optional<List<Housing>> getHousingByNumber(Integer number);
    Optional<List<Housing>> getHousingByStreet(String street);
    void deleteHousing(Integer number,String street);
    Housing saveHousing(Housing housing);
    void updateHousing(Integer number, String calle, Integer cod, String od);
}
