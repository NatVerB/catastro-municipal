package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.FlatResident;

import java.util.List;
import java.util.Optional;

public interface FlatResidentRepository {
    List<FlatResident> getAllFlatResidents();
    Optional<List<FlatResident>> getFlatResidentsByDni(Integer dni);
    void deleteFlatResidentByDni(Integer dni);
    FlatResident saveFlatResident(FlatResident flatResident);
    FlatResident updateFlatResident(FlatResident flatResident);
}
