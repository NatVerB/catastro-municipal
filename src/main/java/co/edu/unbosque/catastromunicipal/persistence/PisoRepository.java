package co.edu.unbosque.catastromunicipal.persistence;

import co.edu.unbosque.catastromunicipal.domain.Floor;
import co.edu.unbosque.catastromunicipal.domain.repository.FloorRepository;
import co.edu.unbosque.catastromunicipal.persistence.crud.PisoCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.Piso;
import co.edu.unbosque.catastromunicipal.persistence.mapper.FloorMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PisoRepository implements FloorRepository {
    private PisoCrudRepository pisoCrudRepository;
    private FloorMapper mapper;

    @Override
    public List<Floor> getAllFloors() {
       List<Piso> floors = (List<Piso>) pisoCrudRepository.findAll();
       return mapper.toFloors(floors);
    }

    @Override
    public List<Floor> getFloorsByNumber(Integer number) {
        List<Piso> floors = (List<Piso>) pisoCrudRepository.getById_Numero(number);
        return mapper.toFloors(floors);
    }

    @Override
    public List<Floor> getFloorsByStreet(String street) {
        List<Piso> floors = (List<Piso>) pisoCrudRepository.getById_Calle(street);
        return mapper.toFloors(floors);
    }

    @Override
    public List<Floor> getFloorsByStair(Character stair) {
        List<Piso> floors = (List<Piso>) pisoCrudRepository.getById_Escalera(stair);
        return mapper.toFloors(floors);
    }

    @Override
    public List<Floor> getFloorsByLevel(Integer level) {
        List<Piso> floors = (List<Piso>) pisoCrudRepository.getById_Planta(level);
        return mapper.toFloors(floors);
    }

    @Override
    public List<Floor> getFloorsByDoor(String door) {
        List<Piso> floors = (List<Piso>) pisoCrudRepository.getById_Puerta(door);
        return mapper.toFloors(floors);
    }

    @Override
    public void deleteFloorByNumber(Integer number) {
        pisoCrudRepository.deleteById_Numero(number);
    }

    @Override
    public void deleteFloorByStreet(String street) {
        pisoCrudRepository.deleteById_Calle(street);
    }

    @Override
    public void deleteFloorByStair(Character stair) {
        pisoCrudRepository.deleteById_Escalera(stair);
    }

    @Override
    public void deleteFloorByLevel(Integer level) {
        pisoCrudRepository.deleteById_Planta(level);
    }

    @Override
    public void deleteFloorByDoor(String door) {
        pisoCrudRepository.deleteById_Puerta(door);
    }

    @Override
    public Floor saveFloor(Floor floor) {
        Piso piso = mapper.toPiso(floor);
        return mapper.toFloor(pisoCrudRepository.save(piso));
    }

    @Override
    public Floor updateFloor(Floor floor) {
        Piso piso = mapper.toPiso(floor);
        if (piso.getId() != null && pisoCrudRepository.existsById(piso.getId())) {
            return mapper.toFloor(pisoCrudRepository.save(piso));
        } else {
            throw new RuntimeException("No se puede actualizar Piso porque no existe en la base de datos.");
        }
    }
}
