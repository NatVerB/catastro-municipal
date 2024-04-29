package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @Column(name = "dni", length = 8, nullable = false)
    private Integer id;
    @Column(name = "nombre_persona", length = 20, nullable = false)
    private String name;
    @Column(name = "apellidos_persona", length = 40, nullable = false)
    private String lastName;
    @Column(name = "od_persona")
    private Long additInfo;
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

    public Vivienda getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(Vivienda houseNum) {
        this.houseNum = houseNum;
    }

    public Vivienda getStreet() {
        return street;
    }

    public void setStreet(Vivienda street) {
        this.street = street;
    }

    public List<Persona> getHouseholdMembers() {
        return householdMembers;
    }

    public void setHouseholdMembers(List<Persona> householdMembers) {
        this.householdMembers = householdMembers;
    }

    public Persona getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(Persona householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public Long getAdditInfo() {
        return additInfo;
    }

    public void setAdditInfo(Long additInfo) {
        this.additInfo = additInfo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
