package co.edu.unbosque.catastromunicipal.domain.service;

import co.edu.unbosque.catastromunicipal.domain.UrbanZone;
import co.edu.unbosque.catastromunicipal.domain.repository.UrbanZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UrbanZoneService {
    @Autowired
    private UrbanZoneRepository urbanZoneRepository;

    public List<UrbanZone> getAllUrbanZones(){
        return urbanZoneRepository.getAllUrbanZones();
    }
    public Optional<List<UrbanZone>> getUrbanZoneByName(String name){
        return urbanZoneRepository.getUrbanZoneByName(name);
    }
    public boolean deleteUrbanZoneByName(String name){
        if(getUrbanZoneByName(name).isPresent()){
            urbanZoneRepository.deleteUrbanZoneByName(name);
            return true;
        }else{
            return false;
        }
    }
    public  UrbanZone saveUrbanZone(UrbanZone urbanZone){
        return urbanZoneRepository.saveUrbanZone(urbanZone);
    }
    public boolean updateUrbanZone(UrbanZone urbanZone){
        if(getUrbanZoneByName(urbanZone.getZoneName()).isPresent()){
            urbanZoneRepository.updateUrbanZone(urbanZone);
            return true;
        }else{
            return false;
        }
    }
}

