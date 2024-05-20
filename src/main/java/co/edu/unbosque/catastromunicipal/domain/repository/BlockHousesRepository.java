package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.BlockHouses;

import java.util.List;
import java.util.Optional;

public interface BlockHousesRepository {
    List<BlockHouses> getAllBlockHouses();
    Optional<List<BlockHouses>> getBlockHousesByStreet(String street);
    Optional<List<BlockHouses>> getBlockHousesByNumber(Integer number);
    void deleteBlockHousesByNumber(Integer number);
    void deleteBlockHousesByStreet(String street);
    BlockHouses saveBlockHouses(BlockHouses blockHouses);
    BlockHouses updateBlockHouses(BlockHouses blockHouses);
}
