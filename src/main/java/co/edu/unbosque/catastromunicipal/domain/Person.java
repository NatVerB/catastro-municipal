package co.edu.unbosque.catastromunicipal.domain;

import java.util.List;

public class Person {
    private Integer id;
    private String name;
    private String lastName;
    private String personOd;
    private Person headHousehold;
    private List<Person> members;
    private Housing housing;
    private List<PrivateHouse> privateHouses;

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

    public Person getHeadHousehold() {
        return headHousehold;
    }

    public void setHeadHousehold(Person headHousehold) {
        this.headHousehold = headHousehold;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    public Housing getHousing() {
        return housing;
    }

    public void setHousing(Housing housing) {
        this.housing = housing;
    }

    public List<PrivateHouse> getPrivateHouses() {
        return privateHouses;
    }

    public void setPrivateHouses(List<PrivateHouse> privateHouses) {
        this.privateHouses = privateHouses;
    }
}
