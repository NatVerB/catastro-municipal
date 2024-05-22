package co.edu.unbosque.catastromunicipal.domain;

import jakarta.persistence.Column;

public class FlatResident {
    private Integer id;
    private String street;
    private Integer number;
    private Character stair;
    private Integer level;
    private String door;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Character getStair() {
        return stair;
    }

    public void setStair(Character stair) {
        this.stair = stair;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }
}
