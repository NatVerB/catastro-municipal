package co.edu.unbosque.catastromunicipal.persistence;

import co.edu.unbosque.catastromunicipal.domain.BlockHouses;
import co.edu.unbosque.catastromunicipal.domain.repository.BlockHousesRepository;
import co.edu.unbosque.catastromunicipal.persistence.crud.BloqueCasasCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasas;
import co.edu.unbosque.catastromunicipal.persistence.mapper.BlockHousesMapper;
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
    public Optional<List<BlockHouses>> getBlockHousesByStreet(String calle){
        List<BloqueCasas> bloqueCasas =  bloqueCasasCrudRepository.findById_Calle(calle);
        return Optional.of(mapper.toBlockHouses(bloqueCasas));
    }

    @Override
    public Optional<List<BlockHouses>> getBlockHousesByNumber(Integer numero){
        List<BloqueCasas> bloqueCasas =  (List<BloqueCasas>) bloqueCasasCrudRepository.findById_Numero(numero);
        return Optional.of(mapper.toBlockHouses(bloqueCasas));
    }

    @Override
    public void deleteBlockHousesByNumber(Integer number){
        bloqueCasasCrudRepository.deleteById_Numero(number);
    }

    @Override
    public void deleteBlockHousesByStreet(String street){
        bloqueCasasCrudRepository.deleteById_Calle(street);
    }

    @Override
    public BlockHouses saveBlockHouses (BlockHouses bloque){
        BloqueCasas bloqueCasas = mapper.toBloqueCasas(bloque);
        return mapper.toBlockHouses(bloqueCasasCrudRepository.save(bloqueCasas));
    }

    @Override
    public BlockHouses updateBlockHouses(BlockHouses blockHouses){
        BloqueCasas bloqueCasas = mapper.toBloqueCasas(blockHouses);
        if (bloqueCasas.getId() != null && bloqueCasasCrudRepository.findById_Numero(blockHouses.getNumber())!=null) {
            return mapper.toBlockHouses(bloqueCasasCrudRepository.save(bloqueCasas));
        } else {
            throw new RuntimeException("No se puede actualizar el BloqueCasas porque no existe en la base de datos.");
        }
    }
}
