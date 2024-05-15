package co.edu.unbosque.catastromunicipal.domain;

public class Floor {
    private Integer number;
    private String street;
    private String stair;
    private Integer level;
    private String door;

    private Integer meters;
    private String floorOd;
    private BlockHouses blockHouses;
    private FlatResident flatResident;
    private Person person;

    //falta el de la persona private Person person;


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

    public String getStair() {
        return stair;
    }

    public void setStair(String stair) {
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

    public BlockHouses getBlockHouses() {
        return blockHouses;
    }

    public void setBlockHouses(BlockHouses blockHouses) {
        this.blockHouses = blockHouses;
    }

    public FlatResident getFlatResident() {
        return flatResident;
    }

    public void setFlatResident(FlatResident flatResident) {
        this.flatResident = flatResident;
    }
}
