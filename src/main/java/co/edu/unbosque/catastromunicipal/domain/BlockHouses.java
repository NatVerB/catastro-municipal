package co.edu.unbosque.catastromunicipal.domain;

import co.edu.unbosque.catastromunicipal.persistence.entity.Piso;

import java.util.List;

public class BlockHouses {
    private Integer number;
    private String street;
    private Integer blockMeters;
    private String blockOd;

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
