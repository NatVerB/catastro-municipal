package co.edu.unbosque.catastromunicipal.persistence;

import co.edu.unbosque.catastromunicipal.domain.PrivateHouse;
import co.edu.unbosque.catastromunicipal.domain.repository.PrivateHouseRepository;
import co.edu.unbosque.catastromunicipal.persistence.crud.CasaParticularCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.CasaParticular;
import co.edu.unbosque.catastromunicipal.persistence.mapper.PrivateHousesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CasaParticularRepository implements PrivateHouseRepository {
    @Autowired
    private CasaParticularCrudRepository casaParticularCrudRepository;
    @Autowired
    private PrivateHousesMapper mapper;

    @Override
    public List<PrivateHouse> getAllPrivateHouses() {
        List<CasaParticular> casaParticular = (List<CasaParticular>) casaParticularCrudRepository.findAll();
        return mapper.toPrivateHouses(casaParticular);
    }

    @Override
    public List<PrivateHouse> getPrivateHousesByNumber(Integer number) {
        List<CasaParticular> casaParticular = (List<CasaParticular>) casaParticularCrudRepository.findById_Numero(number);
        return mapper.toPrivateHouses(casaParticular);
    }

    @Override
    public List<PrivateHouse> getPrivateHousesByStreet(String street) {
        List<CasaParticular> casaParticular = (List<CasaParticular>)casaParticularCrudRepository.findById_Calle(street);
        return mapper.toPrivateHouses(casaParticular);
    }

    @Override
    public void deletePrivateHouseByNumber(Integer number) {
        casaParticularCrudRepository.deleteById_Numero(number);
    }

    @Override
    public void deletePrivateHouseByStreet(String street) {
        casaParticularCrudRepository.deleteById_Calle(street);
    }

    @Override
    public PrivateHouse savePrivateHouse(PrivateHouse privateHouse) {
        CasaParticular casaParticular= mapper.toCasaParticular(privateHouse);
        return mapper.toPrivateHouse(casaParticularCrudRepository.save(casaParticular));
    }

    @Override
    public PrivateHouse updatePrivateHouse(PrivateHouse privateHouse) {
        CasaParticular casaParticular= mapper.toCasaParticular(privateHouse);
        if (casaParticular.getId() != null && casaParticularCrudRepository.existsById(casaParticular.getId())) {
            return mapper.toPrivateHouse(casaParticularCrudRepository.save(casaParticular));
        } else {
            throw new RuntimeException("No se puede actualizar CasaParticular porque no existe en la base de datos.");
        }
    }
}
