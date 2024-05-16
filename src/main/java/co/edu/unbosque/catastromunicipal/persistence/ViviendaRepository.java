package co.edu.unbosque.catastromunicipal.persistence;

import co.edu.unbosque.catastromunicipal.domain.Housing;
import co.edu.unbosque.catastromunicipal.domain.repository.HousingRepository;
import co.edu.unbosque.catastromunicipal.persistence.crud.ViviendaCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.Vivienda;
import co.edu.unbosque.catastromunicipal.persistence.mapper.HousingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    public List<Housing> getHousingByNumber(Integer number) {
        List<Vivienda> viviendas = (List<Vivienda>) viviendaCrudRepository.getById_Numero(number);
        return mapper.toHousingList(viviendas);
    }

    @Override
    public List<Housing> getHousingByStreet(String street) {
        List<Vivienda> viviendas = (List<Vivienda>) viviendaCrudRepository.findById_Calle(street);
        return mapper.toHousingList(viviendas);
    }

    @Override
    public void deleteHousingByNumber(Integer number) {
        viviendaCrudRepository.deleteById_Numero(number);
    }

    @Override
    public void deleteHousingByStreet(String street) {
        viviendaCrudRepository.deleteById_Calle(street);
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
