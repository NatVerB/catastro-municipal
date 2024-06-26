package co.edu.unbosque.catastromunicipal.persistence;

import co.edu.unbosque.catastromunicipal.domain.PrivateHouse;
import co.edu.unbosque.catastromunicipal.domain.repository.PrivateHouseRepository;
import co.edu.unbosque.catastromunicipal.persistence.crud.CasaParticularCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.CasaParticular;
import co.edu.unbosque.catastromunicipal.persistence.mapper.PrivateHousesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

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
    public Optional<PrivateHouse> getPrivateHousesByNumber(Integer number) {
        CasaParticular casaParticular = casaParticularCrudRepository.findById_Numero(number);
        return Optional.of(mapper.toPrivateHouse(casaParticular));
    }

    @Override
    public Optional<PrivateHouse> getPrivateHousesByStreet(String street) {
        CasaParticular casaParticular = casaParticularCrudRepository.findById_Calle(street);
        return Optional.of(mapper.toPrivateHouse(casaParticular));
    }

    @Override
    public void deletePrivateHouse(Integer number, String street) {
        casaParticularCrudRepository.delete(casaParticularCrudRepository.findById_NumeroAndId_Calle(number, street));
    }

    @Override
    public PrivateHouse savePrivateHouse(PrivateHouse privateHouse) {
        CasaParticular casaParticular= mapper.toCasaParticular(privateHouse);
        return mapper.toPrivateHouse(casaParticularCrudRepository.save(casaParticular));
    }

    @Override
    public void updatePrivateHouse(Integer number, String street, String odHouse) {
        CasaParticular casaParticular= casaParticularCrudRepository.findById_Numero(number);
        if (casaParticular!=null) {
            casaParticular.setOdCasa(odHouse);
            casaParticularCrudRepository.save(casaParticular);
        } else {
            throw new RuntimeException("No se puede actualizar CasaParticular porque no existe en la base de datos.");
        }
    }
}
