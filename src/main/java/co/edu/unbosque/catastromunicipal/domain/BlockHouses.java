package co.edu.unbosque.catastromunicipal.domain;

public class BlockHouses {
    private Integer number;
    private String street;
    private Integer blockMeters;
    private String blockOd;
    private Housing housing;

    public Housing getHousing() {
        return housing;
    }

    public void setHousing(Housing housing) {
        this.housing = housing;
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

    public Integer getBlockMeters() {
        return blockMeters;
    }

    public void setBlockMeters(Integer blockMeters) {
        this.blockMeters = blockMeters;
    }

    public String getBlockOd() {
        return blockOd;
    }

    public void setBlockOd(String blockOd) {
        this.blockOd = blockOd;
    }
}
