package co.edu.unbosque.catastromunicipal.domain.service;

import co.edu.unbosque.catastromunicipal.domain.Housing;
import co.edu.unbosque.catastromunicipal.domain.repository.HousingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HousingService {
    @Autowired
    private HousingRepository housingRepository;

    public List<Housing> getAllHousings(){
        return housingRepository.getAllHousings();
    }
    public List<Housing> getHousingByNumber(Integer number){
        return housingRepository.getHousingByNumber(number);
    }
    public List<Housing> getHousingByStreet(String street){
        return housingRepository.getHousingByStreet(street);
    }
    public void deleteHousingByNumber(Integer number){
        if(getHousingByNumber(number) != null){
            housingRepository.deleteHousingByNumber(number);
        }
    }
    public void deleteHousingByStreet(String street){
        if(getHousingByStreet(street) != null){
            housingRepository.deleteHousingByStreet(street);
        }
    }
    public Housing saveHousing(Housing housing){
        return housingRepository.saveHousing(housing);
    }
    public Housing updateHousing(Housing housing){
        return housingRepository.updateHousing(housing);
    }
}
