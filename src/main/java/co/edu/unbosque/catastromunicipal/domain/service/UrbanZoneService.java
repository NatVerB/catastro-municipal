package co.edu.unbosque.catastromunicipal.domain.service;

import co.edu.unbosque.catastromunicipal.domain.UrbanZone;
import co.edu.unbosque.catastromunicipal.domain.repository.UrbanZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrbanZoneService {
    @Autowired
    private UrbanZoneRepository urbanZoneRepository;

    public List<UrbanZone> getAllUrbanZones(){
        return urbanZoneRepository.getAllUrbanZones();
    }
    public List<UrbanZone> getUrbanZoneByName(String name){
        return urbanZoneRepository.getUrbanZoneByName(name);
    }
    public void deleteUrbanZoneByName(String name){
        urbanZoneRepository.deleteUrbanZoneByName(name);
    }
    public  UrbanZone saveUrbanZone(UrbanZone urbanZone){
        return urbanZoneRepository.saveUrbanZone(urbanZone);
    }
    public UrbanZone updateUrbanZone(UrbanZone urbanZone){
        return urbanZoneRepository.updateUrbanZone(urbanZone);
    }
}
