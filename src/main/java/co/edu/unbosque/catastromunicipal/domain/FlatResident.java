package co.edu.unbosque.catastromunicipal.domain;

public class FlatResident {

    private Integer id;
    private Floor floor;
    //falta el de private Person person;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
