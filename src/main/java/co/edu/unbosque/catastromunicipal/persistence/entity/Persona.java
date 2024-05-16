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


    @ManyToOne
    @JoinColumn(name = "dni_c")
    private Persona cabezaHogarId;

    @OneToMany(mappedBy = "cabezaHogarId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Persona> miembrosHogar;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "calle", referencedColumnName = "calle", insertable = false, updatable = false),
            @JoinColumn(name = "numero", referencedColumnName = "numero", insertable = false, updatable = false)
    })
    private Vivienda vivienda;


    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CasaParticular> casaParticular;


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

    public Persona getCabezaHogarId() {
        return cabezaHogarId;
    }

    public void setCabezaHogarId(Persona cabezaHogarId) {
        this.cabezaHogarId = cabezaHogarId;
    }

    public List<Persona> getMiembrosHogar() {
        return miembrosHogar;
    }

    public void setMiembrosHogar(List<Persona> miembrosHogar) {
        this.miembrosHogar = miembrosHogar;
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
}
