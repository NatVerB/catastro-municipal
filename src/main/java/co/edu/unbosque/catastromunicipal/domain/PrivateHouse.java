package co.edu.unbosque.catastromunicipal.domain;

public class PrivateHouse {
    private Integer number;
    private String street;
    private Integer meters;
    private String houseOd;
    private Integer dniCp;

    public Integer getDniCp() {
        return dniCp;
    }

    public void setDniCp(Integer dniCp) {
        this.dniCp = dniCp;
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

}
