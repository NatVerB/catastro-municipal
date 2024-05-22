package co.edu.unbosque.catastromunicipal.domain.service;


import co.edu.unbosque.catastromunicipal.domain.PrivateHouse;
import co.edu.unbosque.catastromunicipal.domain.repository.PrivateHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrivateHouseService {
    @Autowired
    private PrivateHouseRepository privateHouseRepository;

    public List<PrivateHouse> getAllPrivateHouses(){
        return privateHouseRepository.getAllPrivateHouses();
    }
    public Optional<PrivateHouse> getPrivateHousesByNumber(Integer number){
        return privateHouseRepository.getPrivateHousesByNumber(number);
    }
    public Optional<PrivateHouse> getPrivateHousesByStreet(String street){
        return privateHouseRepository.getPrivateHousesByStreet(street);
    }
    public boolean deletePrivateHouse(Integer number, String street){
        if(getPrivateHousesByNumber(number).isPresent()&& getPrivateHousesByStreet(street).isPresent()){
            privateHouseRepository.deletePrivateHouse(number, street);
            return true;
        }else {
            return false;
        }
    }

    public PrivateHouse savePrivateHouse(PrivateHouse privateHouse){
        return privateHouseRepository.savePrivateHouse(privateHouse);
    }
    public boolean updatePrivateHouse(Integer number, String street, String odHouse){
        if(getPrivateHousesByNumber(number).isPresent()){
            privateHouseRepository.updatePrivateHouse(number, street, odHouse);
            return true;
        }else{
            return false;
        }
    }
}
