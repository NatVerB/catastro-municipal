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

    public Optional<List<BlockHouses>> getBlockHousesByStreet(String name) {
        return blockHousesRepository.getBlockHousesByStreet(name);
    }

    public Optional<List<BlockHouses>> getBlockHousesByNumber(Integer number) {
        return blockHousesRepository.getBlockHousesByNumber(number);
    }
    public boolean deleteBlockHousesByNumber(Integer number){
        if(getBlockHousesByNumber(number).isPresent()){
            blockHousesRepository.deleteBlockHousesByNumber(number);
            return true;
        }else{
            return false;
        }
    }

    public boolean deleteBlockHousesByStreet(String street){
        if(getBlockHousesByStreet(street).isPresent()){
            blockHousesRepository.deleteBlockHousesByStreet(street);
            return true;
        }else{
            return false;
        }
    }

    public BlockHouses saveBlockHouses(BlockHouses blockHouses) {
        return blockHousesRepository.saveBlockHouses(blockHouses);
    }

    public boolean updateBlockHouses(BlockHouses blockHouses){
        if(getBlockHousesByNumber(blockHouses.getNumber()).isPresent()&&getBlockHousesByStreet(blockHouses.getStreet()).isPresent()){
            blockHousesRepository.updateBlockHouses(blockHouses);
            return true;
        }else{
            return false;
        }
    }

}
