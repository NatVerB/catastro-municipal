package co.edu.unbosque.catastromunicipal.persistence;

import co.edu.unbosque.catastromunicipal.domain.FlatResident;
import co.edu.unbosque.catastromunicipal.domain.repository.FlatResidentRepository;
import co.edu.unbosque.catastromunicipal.persistence.crud.HabitaPisoCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.HabitaPiso;
import co.edu.unbosque.catastromunicipal.persistence.mapper.FlatResidentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HabitaPisoRepository implements FlatResidentRepository {
    @Autowired
    private HabitaPisoCrudRepository habitaPisoCrudRepository;
    @Autowired
    private FlatResidentMapper mapper;

    @Override
    public List<FlatResident> getAllFlatResidents() {
        List<HabitaPiso> flatResidents = (List<HabitaPiso>) habitaPisoCrudRepository.findAll();
        return mapper.toFlatResidents(flatResidents);
    }

    @Override
    public List<FlatResident> getFlatResidentsByDni(Integer dni) {
        List<HabitaPiso> flatResidents = (List<HabitaPiso>) habitaPisoCrudRepository.findByDni(dni);
        return mapper.toFlatResidents(flatResidents);
    }

    @Override
    public void deleteFlatResidentByDni(Integer dni) {
        habitaPisoCrudRepository.deleteByDni(dni);
    }

    @Override
    public FlatResident saveFlatResident(FlatResident flatResident) {
        HabitaPiso habitaPiso = mapper.toHabitaPiso(flatResident);
        return mapper.toFlatResident(habitaPisoCrudRepository.save(habitaPiso));
    }

    @Override
    public FlatResident updateFlatResident(FlatResident flatResident) {
        HabitaPiso habitaPiso = mapper.toHabitaPiso(flatResident);
        if (habitaPiso.getDni() != null && habitaPisoCrudRepository.existsById(habitaPiso.getDni())) {
            return mapper.toFlatResident(habitaPisoCrudRepository.save(habitaPiso));
        } else {
            throw new RuntimeException("No se puede actualizar HabitaPiso porque no existe en la base de datos.");
        }
    }
}
