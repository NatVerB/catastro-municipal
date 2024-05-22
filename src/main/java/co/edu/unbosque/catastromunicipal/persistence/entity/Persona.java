package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Persona", schema = "dbo")
public class Persona {

    @Id
    @Column(name = "dni", length = 8, nullable = false)
    private Integer id;
    @Column(name = "nombre_persona", length = 20, nullable = false)
    private String nombre;
    @Column(name = "apellidos_persona", length = 40, nullable = false)
    private String apellido;
    @Column(name = "od_persona")
    private String odPersona;
    @Column(name = "dni_c")
    private Integer dniC;
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private Integer numero;

    @ManyToOne
    @JoinColumn(name = "dni_c", referencedColumnName = "dni", insertable = false, updatable = false)
    private Persona persona;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Persona> personas;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "calle", referencedColumnName = "calle", insertable = false, updatable = false),
            @JoinColumn(name = "numero", referencedColumnName = "numero", insertable = false, updatable = false)
    })
    private Vivienda vivienda;


    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CasaParticular> casaParticular;

    public Integer getDniC() {
        return dniC;
    }

    public void setDniC(Integer dniC) {
        this.dniC = dniC;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOdPersona() {
        return odPersona;
    }

    public void setOdPersona(String odPersona) {
        this.odPersona = odPersona;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<CasaParticular> getCasaParticular() {
        return casaParticular;
    }

    public void setCasaParticular(List<CasaParticular> casaParticular) {
        this.casaParticular = casaParticular;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
