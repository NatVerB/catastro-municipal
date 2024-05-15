package co.edu.unbosque.catastromunicipal.domain;

import java.util.List;

public class Housing {

    private Integer number;
    private String street;
    private Character type;
    private Integer postalCode;
    private Integer meters;
    private String housingOd;
    private UrbanZone urbanZone;
    private BlockHouses blockHouses;
    private PrivateHouse privateHouse;
    private List<Person> people;

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public BlockHouses getBlockHouses() {
        return blockHouses;
    }

    public void setBlockHouses(BlockHouses blockHouses) {
        this.blockHouses = blockHouses;
    }

    public PrivateHouse getPrivateHouse() {
        return privateHouse;
    }

    public void setPrivateHouse(PrivateHouse privateHouse) {
        this.privateHouse = privateHouse;
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

    public UrbanZone getUrbanZone() {
        return urbanZone;
    }

    public void setUrbanZone(UrbanZone urbanZone) {
        this.urbanZone = urbanZone;
    }
}
