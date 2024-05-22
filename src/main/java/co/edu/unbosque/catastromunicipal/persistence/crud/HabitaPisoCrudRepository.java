package co.edu.unbosque.catastromunicipal.persistence.crud;

import co.edu.unbosque.catastromunicipal.persistence.entity.HabitaPiso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface HabitaPisoCrudRepository extends CrudRepository<HabitaPiso, Integer> {
    public HabitaPiso findByDni(Integer id);
    public void deleteByDni(Integer id);
}
