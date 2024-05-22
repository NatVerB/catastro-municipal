package co.edu.unbosque.catastromunicipal.persistence;

import co.edu.unbosque.catastromunicipal.domain.BlockHouses;
import co.edu.unbosque.catastromunicipal.domain.repository.BlockHousesRepository;
import co.edu.unbosque.catastromunicipal.persistence.crud.BloqueCasasCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasas;
import co.edu.unbosque.catastromunicipal.persistence.mapper.BlockHousesMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BloqueCasasRepository implements BlockHousesRepository {
    @Autowired
    private BlockHousesMapper mapper;
    @Autowired
    private BloqueCasasCrudRepository bloqueCasasCrudRepository;

    @Override
    public List<BlockHouses> getAllBlockHouses() {
        List<BloqueCasas> bloqueCasas =  (List<BloqueCasas>) bloqueCasasCrudRepository.findAll();
        return mapper.toBlockHouses(bloqueCasas);
    }

    @Override
    public Optional<BlockHouses> getBlockHousesByStreet(String calle){
        BloqueCasas bloqueCasas =  bloqueCasasCrudRepository.findById_Calle(calle);
        return Optional.of(mapper.toBlockHouses(bloqueCasas));
    }

    @Override
    public Optional<BlockHouses> getBlockHousesByNumber(Integer numero){
        BloqueCasas bloqueCasas = bloqueCasasCrudRepository.findById_Numero(numero);
        return Optional.of(mapper.toBlockHouses(bloqueCasas));
    }

    @Override
    public void deleteBlockHouse(Integer number, String street) {
        bloqueCasasCrudRepository.delete(bloqueCasasCrudRepository.findById_CalleAndId_Numero(street, number));
    }


    @Override
    public BlockHouses saveBlockHouses (BlockHouses bloque){
        BloqueCasas bloqueCasas = mapper.toBloqueCasas(bloque);
        return mapper.toBlockHouses(bloqueCasasCrudRepository.save(bloqueCasas));
    }

    @Override
    public void updateBlockHouses(Integer number, String street, String odHouse){
        BloqueCasas bloqueCasas = bloqueCasasCrudRepository.findById_Numero(number);
        if (bloqueCasas != null ) {
            bloqueCasas.setOdBloque(odHouse);
            bloqueCasasCrudRepository.save(bloqueCasas);
        }
    }
}
