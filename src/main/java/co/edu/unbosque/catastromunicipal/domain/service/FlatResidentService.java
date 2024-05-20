package co.edu.unbosque.catastromunicipal.domain.service;

import co.edu.unbosque.catastromunicipal.domain.FlatResident;
import co.edu.unbosque.catastromunicipal.domain.repository.FlatResidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlatResidentService {
    @Autowired
    private FlatResidentRepository flatResidentRepository;

    public List<FlatResident> getAllFlatResidents() {
        return flatResidentRepository.getAllFlatResidents();
    }

    public Optional<List<FlatResident>> getFlatResidentsByDni(Integer dni) {
        return flatResidentRepository.getFlatResidentsByDni(dni);
    }

    public boolean deleteFlatResidentByDni(Integer dni) {
        if (getFlatResidentsByDni(dni).isPresent()) {
            flatResidentRepository.deleteFlatResidentByDni(dni);
            return true;
        } else {
            return false;
        }
    }

    public FlatResident saveFlatResident(FlatResident flatResident) {
        return flatResidentRepository.saveFlatResident(flatResident);
    }

    public boolean updateFlatResident(FlatResident flatResident) {
        if (getFlatResidentsByDni(flatResident.getId()).isPresent()) {
            flatResidentRepository.updateFlatResident(flatResident);
            return true;
        } else {
            return false;
        }
    }
}