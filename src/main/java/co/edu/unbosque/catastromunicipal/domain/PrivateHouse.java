package co.edu.unbosque.catastromunicipal.domain;

public class PrivateHouse {
    private Integer number;
    private String street;
    private Integer meters;
    private String houseOd;
    private Housing housing;
    private Person person;

    // falta el de private Person person;


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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

    public Integer getMeters() {
        return meters;
    }

    public void setMeters(Integer meters) {
        this.meters = meters;
    }

    public String getHouseOd() {
        return houseOd;
    }

    public void setHouseOd(String houseOd) {
        this.houseOd = houseOd;
    }

    public Housing getHousing() {
        return housing;
    }

    public void setHousing(Housing housing) {
        this.housing = housing;
    }
}
