package co.edu.unbosque.catastromunicipal.persistence;

import co.edu.unbosque.catastromunicipal.domain.Floor;
import co.edu.unbosque.catastromunicipal.domain.repository.FloorRepository;
import co.edu.unbosque.catastromunicipal.persistence.crud.PisoCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.Piso;
import co.edu.unbosque.catastromunicipal.persistence.mapper.FloorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PisoRepository implements FloorRepository {
    @Autowired
    private PisoCrudRepository pisoCrudRepository;
    @Autowired
    private FloorMapper mapper;

    @Override
    public List<Floor> getAllFloors() {
       List<Piso> floors = (List<Piso>) pisoCrudRepository.findAll();
       return mapper.toFloors(floors);
    }

    @Override
    public Optional<Floor> getFloorsByNumber(Integer number) {
        Piso floors = pisoCrudRepository.getById_Numero(number);
        return Optional.of(mapper.toFloor(floors));
    }

    @Override
    public Optional<Floor> getFloorsByStreet(String street) {
        Piso floors = pisoCrudRepository.getById_Calle(street);
        return Optional.of(mapper.toFloor(floors));
    }

    @Override
    public Optional<Floor> getFloorsByStair(Character stair) {
        Piso floors = pisoCrudRepository.getById_Escalera(stair);
        return Optional.of(mapper.toFloor(floors));
    }

    @Override
    public Optional<Floor> getFloorsByLevel(Integer level) {
        Piso floors =  pisoCrudRepository.getById_Planta(level);
        return Optional.of(mapper.toFloor(floors));
    }

    @Override
    public Optional<Floor> getFloorsByDoor(String door) {
        Piso floors =  pisoCrudRepository.getById_Puerta(door);
        return Optional.of(mapper.toFloor(floors));
    }

    @Override
    public void deleteFloor(Integer number, String street, Character stair, Integer level, String door) {

        pisoCrudRepository.delete(pisoCrudRepository.findById_NumeroAndId_CalleAndId_EscaleraAndId_PlantaAndId_Puerta(number, street, stair, level, door));
    }

    @Override
    public Floor saveFloor(Floor floor) {
        Piso piso = mapper.toPiso(floor);
        return mapper.toFloor(pisoCrudRepository.save(piso));
    }

    @Override
    public void updateFloor(Integer number, String street, Integer meters, String odFloor) {
        Piso piso = pisoCrudRepository.getById_Numero(number);
        if (piso!=null) {
            piso.setOdPiso(odFloor);
            piso.setMetrosP(meters);
            pisoCrudRepository.save(piso);
        }
    }
}
