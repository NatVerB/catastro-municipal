package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "BloqueCasas", schema = "dbo")
public class BloqueCasas {

    @EmbeddedId
    private ViviendaPK id;

    @Column(name = "metros_b")
    private int metrosBloque;

    @Column(name = "od_bloque")
    private String odBloque;

    //Relaciones
    //Relacion con vivienda
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "numero", referencedColumnName = "numero", insertable = false, updatable = false),
            @JoinColumn(name = "calle", referencedColumnName = "calle", insertable = false, updatable = false)
    })
    private Vivienda vivienda;

    @OneToMany(mappedBy = "bloqueCasas", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Piso> piso;


    // getters y setters

    public ViviendaPK getId() {
        return id;
    }

    public void setId(ViviendaPK id) {
        this.id = id;
    }

    public int getMetrosBloque() {
        return metrosBloque;
    }

    public void setMetrosBloque(int metrosBloque) {
        this.metrosBloque = metrosBloque;
    }

    public String getOdBloque() {
        return odBloque;
    }

    public void setOdBloque(String odBloque) {
        this.odBloque = odBloque;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public List<Piso> getPiso() {
        return piso;
    }

    public void setPiso(List<Piso> piso) {
        this.piso = piso;
    }
}
