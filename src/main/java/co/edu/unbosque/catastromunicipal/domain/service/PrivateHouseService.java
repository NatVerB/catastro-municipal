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
    public Optional<List<PrivateHouse>> getPrivateHousesByNumber(Integer number){
        return privateHouseRepository.getPrivateHousesByNumber(number);
    }
    public Optional<List<PrivateHouse>> getPrivateHousesByStreet(String street){
        return privateHouseRepository.getPrivateHousesByStreet(street);
    }
    public boolean deletePrivateHouseByNumber(Integer number){
        if(getPrivateHousesByNumber(number).isPresent()){
            privateHouseRepository.deletePrivateHouseByNumber(number);
            return true;
        }else {
            return false;
        }
    }
    public boolean deletePrivateHouseByStreet(String street){
        if(getPrivateHousesByStreet(street).isPresent()){
            privateHouseRepository.deletePrivateHouseByStreet(street);
            return true;
        }else{
            return false;
        }
    }
    public PrivateHouse savePrivateHouse(PrivateHouse privateHouse){
        return privateHouseRepository.savePrivateHouse(privateHouse);
    }
    public boolean updatePrivateHouse(PrivateHouse privateHouse){
        if(getPrivateHousesByNumber(privateHouse.getNumber()).isPresent() && getPrivateHousesByStreet(privateHouse.getStreet()).isPresent()){
            privateHouseRepository.updatePrivateHouse(privateHouse);
            return true;
        }else{
            return false;
        }
    }
}
