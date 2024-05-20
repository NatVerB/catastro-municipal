package co.edu.unbosque.catastromunicipal.domain;

public class Floor {
    private Integer number;
    private String street;
    private Character stair;
    private Integer level;
    private String door;

    private Integer meters;
    private String floorOd;


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

    public Integer getMeters() {
        return meters;
    }

    public void setMeters(Integer meters) {
        this.meters = meters;
    }

    public String getFloorOd() {
        return floorOd;
    }

    public void setFloorOd(String floorOd) {
        this.floorOd = floorOd;
    }
}
