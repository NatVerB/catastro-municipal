package co.edu.unbosque.catastromunicipal.domain.service;

import co.edu.unbosque.catastromunicipal.domain.BlockHouses;
import co.edu.unbosque.catastromunicipal.domain.repository.BlockHousesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class BlockHousesService {
    @Autowired
    private BlockHousesRepository blockHousesRepository;

    public List<BlockHouses> getAllBlockHouses() {
        return blockHousesRepository.getAllBlockHouses();
    }

    public Optional<BlockHouses> getBlockHousesByStreet(String name) {
        return blockHousesRepository.getBlockHousesByStreet(name);
    }

    public Optional<BlockHouses> getBlockHousesByNumber(Integer number) {
        return blockHousesRepository.getBlockHousesByNumber(number);
    }
    public boolean deleteBlockHouse(Integer number, String street){
        if(getBlockHousesByNumber(number).isPresent()&& getBlockHousesByStreet(street).isPresent()){
            blockHousesRepository.deleteBlockHouse(number, street);
            return true;
        }else{
            return false;
        }
    }

    public BlockHouses saveBlockHouses(BlockHouses blockHouses) {
        return blockHousesRepository.saveBlockHouses(blockHouses);
    }

    public boolean updateBlockHouses(Integer number, String street, String odHouse){
        if(getBlockHousesByNumber(number).isPresent()){
            blockHousesRepository.updateBlockHouses(number, street, odHouse);
            return true;
        }else{
            return false;
        }
    }
}