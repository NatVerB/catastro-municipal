package co.edu.unbosque.catastromunicipal.persistence;

import co.edu.unbosque.catastromunicipal.domain.Housing;
import co.edu.unbosque.catastromunicipal.domain.repository.HousingRepository;
import co.edu.unbosque.catastromunicipal.persistence.crud.ViviendaCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.Vivienda;
import co.edu.unbosque.catastromunicipal.persistence.mapper.HousingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class ViviendaRepository implements HousingRepository {
    @Autowired
    private ViviendaCrudRepository viviendaCrudRepository;
    @Autowired
    private HousingMapper mapper;

    @Override
    public List<Housing> getAllHousings() {
        List<Vivienda> viviendas = (List<Vivienda>) viviendaCrudRepository.findAll();
        return mapper.toHousingList(viviendas);
    }

    @Override
    public Optional<List<Housing>> getHousingByNumber(Integer number) {
        List<Vivienda> viviendas =  viviendaCrudRepository.getById_Numero(number);
        return Optional.of(mapper.toHousingList(viviendas));
    }

    @Override
    public Optional<List<Housing>> getHousingByStreet(String street) {
        List<Vivienda> viviendas =  viviendaCrudRepository.getById_Calle(street);
        return Optional.of(mapper.toHousingList(viviendas));
    }

    @Override
    public void deleteHousing(Integer number, String street) {
        Vivienda vivienda = viviendaCrudRepository.findById_NumeroAndId_Calle(number, street);
        if(vivienda != null){
            viviendaCrudRepository.delete(vivienda);
        }
    }


    @Override
    public Housing saveHousing(Housing housing) {
        Vivienda vivienda = mapper.toVivienda(housing);
        return mapper.toHousing(viviendaCrudRepository.save(vivienda));
    }

    @Override
    public Housing updateHousing(Housing housing) {
        Vivienda vivienda = mapper.toVivienda(housing);
        if (vivienda.getId() != null && viviendaCrudRepository.existsById(vivienda.getId())) {
            return mapper.toHousing(viviendaCrudRepository.save(vivienda));
        } else {
            throw new RuntimeException("No se puede actualizar el BloqueCasas porque no existe en la base de datos.");
        }
    }
}
