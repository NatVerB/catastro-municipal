package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.BlockHouses;

import java.util.List;
import java.util.Optional;

public interface BlockHousesRepository {
    List<BlockHouses> getAllBlockHouses();
    Optional<BlockHouses> getBlockHousesByStreet(String street);
    Optional<BlockHouses>  getBlockHousesByNumber(Integer number);
    void deleteBlockHousesByNumber(Integer number);
    void deleteBlockHousesByStreet(String street);
    BlockHouses saveBlockHouses(BlockHouses blockHouses);
    void updateBlockHouses(Integer number, String street, String odHouse );
}
