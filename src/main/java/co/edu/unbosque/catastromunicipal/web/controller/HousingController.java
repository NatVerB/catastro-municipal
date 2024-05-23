package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.Housing;
import co.edu.unbosque.catastromunicipal.domain.service.HousingService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/housing")
@Transactional
public class HousingController {
    @Autowired
    private HousingService housingService;

    @GetMapping("/allhousings")
    public List<Housing> getAllHousings() {
        return housingService.getAllHousings();
    }

    @GetMapping("/housing/bynumber/{id}")
    public ResponseEntity<List<Housing>> getHousingByNumber(@PathVariable("id") Integer number) {
        return housingService.getHousingByNumber(number).map(housings -> new ResponseEntity<>(housings, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/housing/bystreet/{id}")
    public ResponseEntity<List<Housing>> getHousingByStreet(@PathVariable("id") String street) {
        return housingService.getHousingByStreet(street).map(housings -> new ResponseEntity<>(housings, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/deletehousing")
    public ResponseEntity<String> deleteHousing(Integer number, String street) {
        if (housingService.deleteHousing(number, street)) {
            return new ResponseEntity<>("Housing delete", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Housing not delete", HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/addhousing")
    public ResponseEntity<Housing> saveHousing(Housing housing) {
        return new ResponseEntity<>(housingService.saveHousing(housing), HttpStatus.CREATED);
    }

    @PutMapping("/updatehousing")
    public ResponseEntity<String> updateHousing(Integer number, String calle, Integer cod, String od) {
        if (housingService.updateHousing(number, calle, cod, od)) {
            return new ResponseEntity<>("Updated", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Not Updated", HttpStatus.NOT_MODIFIED);
        }
    }
}
