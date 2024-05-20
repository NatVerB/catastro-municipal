package co.edu.unbosque.catastromunicipal.domain;


public class Person {
    private Integer id;
    private String name;
    private String lastName;
    private String personOd;
    private Integer dniC;
    private Integer number;
    private String street;

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

    public Integer getDniC() {
        return dniC;
    }

    public void setDniC(Integer dniC) {
        this.dniC = dniC;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonOd() {
        return personOd;
    }

    public void setPersonOd(String personOd) {
        this.personOd = personOd;
    }
}
