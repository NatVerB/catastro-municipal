package co.edu.unbosque.catastromunicipal.domain.service;

import co.edu.unbosque.catastromunicipal.domain.BlockHouses;
import co.edu.unbosque.catastromunicipal.domain.repository.BlockHousesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BlockHousesService {
    @Autowired
    private BlockHousesRepository blockHousesRepository;

    public List<BlockHouses> getAllBlockHouses() {
        return blockHousesRepository.getAllBlockHouses();
    }

    public List<BlockHouses> getBlockHousesByStreet(String name) {
        return blockHousesRepository.getBlockHousesByStreet(name);
    }

    public List<BlockHouses> getBlockHousesByNumber(Integer number) {
        return blockHousesRepository.getBlockHousesByNumber(number);
    }
    public void deleteBlockHousesByNumber(Integer number){
        if(!getBlockHousesByNumber(number).isEmpty()){
            blockHousesRepository.deleteBlockHousesByNumber(number);
        }
    }

    public void deleteBlockHousesByStreet(String street){
        if(!getBlockHousesByStreet(street).isEmpty()){
            blockHousesRepository.deleteBlockHousesByStreet(street);
        }
    }

    public BlockHouses saveBlockHouses(BlockHouses blockHouses) {
        return blockHousesRepository.saveBlockHouses(blockHouses);
    }

    public BlockHouses updateBlockHouses(BlockHouses blockHouses){
        return blockHousesRepository.updateBlockHouses(blockHouses);
    }

}
