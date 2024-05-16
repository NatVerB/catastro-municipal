package co.edu.unbosque.catastromunicipal.domain.service;

import co.edu.unbosque.catastromunicipal.domain.FlatResident;
import co.edu.unbosque.catastromunicipal.domain.repository.FlatResidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlatResidentService {
    @Autowired
    private FlatResidentRepository flatResidentRepository;

    public List<FlatResident> getAllFlatResidents(){
        return flatResidentRepository.getAllFlatResidents();
    }

    public List<FlatResident> getFlatResidentsByDni(Integer dni){
        return flatResidentRepository.getFlatResidentsByDni(dni);
    }

    public void deleteFlatResidentByDni(Integer dni){
        if(!getFlatResidentsByDni(dni).isEmpty()){
            flatResidentRepository.deleteFlatResidentByDni(dni);
        }
    }

    public FlatResident saveFlatResident(FlatResident flatResident){
        return flatResidentRepository.saveFlatResident(flatResident);
    }

    public  FlatResident updateFlatResident(FlatResident flatResident){
        return flatResidentRepository.updateFlatResident(flatResident);
    }

}