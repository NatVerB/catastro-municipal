package co.edu.unbosque.catastromunicipal.domain;

import co.edu.unbosque.catastromunicipal.domain.service.UrbanZoneService;

import java.util.List;
import java.util.Optional;

public class Housing {

    private Integer number;
    private String street;
    private Character type;
    private Integer postalCode;
    private Integer meters;
    private String housingOd;
    private String zoneName;


    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getMeters() {
        return meters;
    }

    public void setMeters(Integer meters) {
        this.meters = meters;
    }

    public String getHousingOd() {
        return housingOd;
    }

    public void setHousingOd(String housingOd) {
        this.housingOd = housingOd;
    }
}
