package co.edu.unbosque.catastromunicipal.web.controller;

import co.edu.unbosque.catastromunicipal.domain.Housing;
import co.edu.unbosque.catastromunicipal.domain.service.HousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/housing")
public class HousingController {
    @Autowired
    private HousingService housingService;
    @GetMapping("/allhousings")
    public List<Housing> getAllHousings(){
        return housingService.getAllHousings();
    }
    @GetMapping("/housing/bynumber/{id}")
    public List<Housing> getHousingByNumber(@PathVariable("id") Integer number){
        return housingService.getHousingByNumber(number);
    }
    @GetMapping("/housing/bystreet/{id}")
    public List<Housing> getHousingByStreet(@PathVariable("id") String street){
        return housingService.getHousingByStreet(street);
    }
    @DeleteMapping("/deletehousing/bynumber")
    public void deleteHousingByNumber(Integer number){
        housingService.deleteHousingByNumber(number);
    }
    @DeleteMapping("/deletehousing/bystreet")
    public void deleteHousingByStreet(String street){
        housingService.deleteHousingByStreet(street);
    }
    @PostMapping("/addhousing")
    public Housing saveHousing(Housing housing){
        return housingService.saveHousing(housing);
    }
    @PostMapping("/updatehousing")
    public Housing updateHousing(Housing housing){
        return housingService.updateHousing(housing);
    }
}
