package co.edu.unbosque.catastromunicipal.domain.service;


import co.edu.unbosque.catastromunicipal.domain.PrivateHouse;
import co.edu.unbosque.catastromunicipal.domain.repository.PrivateHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivateHouseService {
    @Autowired
    private PrivateHouseRepository privateHouseRepository;

    public List<PrivateHouse> getAllPrivateHouses(){
        return privateHouseRepository.getAllPrivateHouses();
    }
    public List<PrivateHouse> getPrivateHousesByNumber(Integer number){
        return privateHouseRepository.getPrivateHousesByNumber(number);
    }
    public List<PrivateHouse> getPrivateHousesByStreet(String street){
        return privateHouseRepository.getPrivateHousesByStreet(street);
    }
    public void deletePrivateHouseByNumber(Integer number){
        if(!getPrivateHousesByNumber(number).isEmpty()){
            privateHouseRepository.deletePrivateHouseByNumber(number);
        }
    }
    public void deletePrivateHouseByStreet(String street){
        if(!getPrivateHousesByStreet(street).isEmpty()){
            privateHouseRepository.deletePrivateHouseByStreet(street);
        }
    }
    public PrivateHouse savePrivateHouse(PrivateHouse privateHouse){
        return privateHouseRepository.savePrivateHouse(privateHouse);
    }
    public PrivateHouse updatePrivateHouse(PrivateHouse privateHouse){
        return privateHouseRepository.updatePrivateHouse(privateHouse);
    }
}
