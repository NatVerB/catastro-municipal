package co.edu.unbosque.catastromunicipal.domain.repository;

import co.edu.unbosque.catastromunicipal.domain.BlockHouses;

import java.util.List;

public interface BlockHousesRepository {
    List<BlockHouses> getAllBlockHouses();
    List<BlockHouses> getBlockHousesByStreet(String street);
    List<BlockHouses> getBlockHousesByNumber(Integer number);
    void deleteBlockHousesByNumber(Integer number);
    void deleteBlockHousesByStreet(String street);
    BlockHouses saveBlockHouses(BlockHouses blockHouses);
    BlockHouses updateBlockHouses(BlockHouses blockHouses);
}
