package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.BlockHouses;
import co.edu.unbosque.catastromunicipal.domain.service.BlockHousesService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blockhouses")
@Transactional
public class BlockHousesController {
    @Autowired
    private BlockHousesService blockHousesService;

    @GetMapping("/allblockhouses")
    public ResponseEntity<List<BlockHouses>> getAllBlockHouses() {
        return new ResponseEntity<>(blockHousesService.getAllBlockHouses(), HttpStatus.OK);
    }


    @GetMapping("/blockhousestreet/{street}")
    public ResponseEntity<BlockHouses> getBlockHousesByStreet(@PathVariable("street") String street) {
        return blockHousesService.getBlockHousesByStreet(street).map(blockHouses -> new ResponseEntity<>(blockHouses, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/blockhousenumber/{number}")
    public ResponseEntity<BlockHouses> getBlockHousesByNumber(@PathVariable("number") Integer number) {
        return blockHousesService.getBlockHousesByNumber(number).map(blockHousesList -> new ResponseEntity<>(blockHousesList, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/deleteblockhouse")
    public ResponseEntity<String> deleteBlockHouse(Integer number, String street) {
        if (blockHousesService.deleteBlockHouse(number, street)) {
            return new ResponseEntity<>("Deleted",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Not Deleted",HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/addblockhouse")
    public ResponseEntity<BlockHouses> saveBlockHouses(BlockHouses blockHouses) {
        return new ResponseEntity<>(blockHousesService.saveBlockHouses(blockHouses), HttpStatus.CREATED);
    }

    @PutMapping("updateblockhouse")
    public ResponseEntity<String> updateBlockHouses(Integer number, String street, String odHouse) {

        if(blockHousesService.updateBlockHouses(number,street,odHouse)){
            return new ResponseEntity<>("Updated",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Not Updated",HttpStatus.NOT_FOUND);
        }
    }
}