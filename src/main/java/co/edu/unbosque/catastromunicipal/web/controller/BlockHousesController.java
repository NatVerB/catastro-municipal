package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.BlockHouses;
import co.edu.unbosque.catastromunicipal.domain.service.BlockHousesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blockhouses")
public class BlockHousesController {
    @Autowired
    private BlockHousesService blockHousesService;

    @GetMapping("/allblockhouses")
    public List<BlockHouses> getAllBlockHouses() {
        return blockHousesService.getAllBlockHouses();
    }

    @GetMapping("/blockhousestreet/{street}")
    public List<BlockHouses> getBlockHousesByStreet(@PathVariable("street") String street) {
        return blockHousesService.getBlockHousesByStreet(street);
    }

    @GetMapping("/blockhousenumber/{number}")
    public List<BlockHouses> getBlockHousesByNumber(@PathVariable("number") Integer number) {
        return blockHousesService.getBlockHousesByNumber(number);
    }

    @DeleteMapping("/deleteblockhouse/bynumber")
    public void deleteBlockHousesByNumber(Integer number) {
        blockHousesService.deleteBlockHousesByNumber(number);
    }

    @DeleteMapping("deleteblockhouse/bystreet")
    public void deleteBlockHousesByStreet(String street) {
        blockHousesService.deleteBlockHousesByStreet(street);
    }

    @PostMapping("/addblockhouse")
    public BlockHouses saveBlockHouses(BlockHouses blockHouses) {
        return blockHousesService.saveBlockHouses(blockHouses);
    }

    @PostMapping("updateblockhouse")
    public BlockHouses updateBlockHouses(BlockHouses blockHouses) {
        return blockHousesService.updateBlockHouses(blockHouses);
    }

}
