package co.edu.unbosque.catastromunicipal.domain.service;

import co.edu.unbosque.catastromunicipal.domain.Housing;
import co.edu.unbosque.catastromunicipal.domain.repository.HousingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class HousingService {
    @Autowired
    private HousingRepository housingRepository;

    public List<Housing> getAllHousings(){
        return housingRepository.getAllHousings();
    }

    public Optional<List<Housing>> getHousingByNumber(Integer number) {
        return housingRepository.getHousingByNumber(number);
    }
    public Optional<List<Housing>> getHousingByStreet(String street){
        return housingRepository.getHousingByStreet(street);
    }
    public boolean deleteHousingByNumber(Integer number){
        if(getHousingByNumber(number).isPresent()){
            housingRepository.deleteHousingByNumber(number);
            return true;
        }else{
            return false;
        }
    }
    public boolean deleteHousingByStreet(String street){
        if(getHousingByStreet(street).isPresent()){
            housingRepository.deleteHousingByStreet(street);
            return true;
        }else{
            return false;
        }
    }
    public Housing saveHousing(Housing housing){
        return housingRepository.saveHousing(housing);
    }
    public boolean updateHousing(Housing housing){
        if(getHousingByStreet(housing.getStreet()).isPresent()&&getHousingByNumber(housing.getNumber()).isPresent()){
            housingRepository.updateHousing(housing);
            return true;
        }else{
            return false;
        }
    }
}

