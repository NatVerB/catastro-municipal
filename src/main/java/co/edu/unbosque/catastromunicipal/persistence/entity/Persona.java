package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @Column(name = "dni", length = 8, nullable = false)
    private int id;
    @Column(name = "nombre_persona", length = 20, nullable = false)
    private String name;
    @Column(name = "apellidos_persona", length = 40, nullable = false)
    private String lastName;
    @Column(name = "od_persona")
    private long additInfo;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dni_c")
    private Persona householdHeadId;
    @OneToMany(mappedBy = "householdHeadId")
    private List<Persona> householdMembers;
    @ManyToOne
    @JoinColumn(name = "calle", referencedColumnName = "calle", insertable = false, updatable = false)
    private Vivienda street;
    @ManyToOne
    @JoinColumn(name = "numero", referencedColumnName = "numero", insertable = false, updatable = false)
    private Vivienda houseNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public long getAdditInfo() {
        return additInfo;
    }

    public void setAdditInfo(long additInfo) {
        this.additInfo = additInfo;
    }

    public Persona getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(Persona householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public List<Persona> getHouseholdMembers() {
        return householdMembers;
    }

    public void setHouseholdMembers(List<Persona> householdMembers) {
        this.householdMembers = householdMembers;
    }

    public Vivienda getStreet() {
        return street;
    }

    public void setStreet(Vivienda street) {
        this.street = street;
    }

    public Vivienda getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(Vivienda houseNum) {
        this.houseNum = houseNum;
    }
}
