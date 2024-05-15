package co.edu.unbosque.catastromunicipal.persistence;

import co.edu.unbosque.catastromunicipal.domain.BlockHouses;
import co.edu.unbosque.catastromunicipal.domain.repository.BlockHousesRepository;
import co.edu.unbosque.catastromunicipal.persistence.crud.BloqueCasasCrudRepository;
import co.edu.unbosque.catastromunicipal.persistence.entity.BloqueCasas;
import co.edu.unbosque.catastromunicipal.persistence.mapper.BlockHousesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BloqueCasasRepository implements BlockHousesRepository {
    private BlockHousesMapper mapper;
    private BloqueCasasCrudRepository bloqueCasasCrudRepository;

    @Override
    public List<BlockHouses> getAllBlockHouses() {
        List<BloqueCasas> bloqueCasas =  (List<BloqueCasas>) bloqueCasasCrudRepository.findAll();
        return mapper.toBlockHouses(bloqueCasas);
    }

    @Override
    public List<BlockHouses> getBlockHousesByStreet(String calle){
        List<BloqueCasas> bloqueCasas =  (List<BloqueCasas>) bloqueCasasCrudRepository.findById_Calle(calle);
        return mapper.toBlockHouses(bloqueCasas);
    }

    @Override
    public List<BlockHouses> getBlockHousesByNumber(Integer numero){
        List<BloqueCasas> bloqueCasas =  (List<BloqueCasas>) bloqueCasasCrudRepository.findById_Numero(numero);
        return mapper.toBlockHouses(bloqueCasas);
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
        if (bloqueCasas.getId() != null && bloqueCasasCrudRepository.existsById(bloqueCasas.getId())) {
            return mapper.toBlockHouses(bloqueCasasCrudRepository.save(bloqueCasas));
        } else {
            throw new RuntimeException("No se puede actualizar el BloqueCasas porque no existe en la base de datos.");
        }
    }
}
