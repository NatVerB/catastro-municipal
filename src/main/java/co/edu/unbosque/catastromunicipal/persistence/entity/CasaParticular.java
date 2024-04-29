package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CasaParticular")
@IdClass(CasaParticular.class)
public class CasaParticular {
    @Id
    @OneToOne
    @JoinColumn(name = "calle", referencedColumnName = "calle", insertable = false, updatable = false)
    private Vivienda calle;
    @Id
    @OneToOne
    @JoinColumn(name = "numero", referencedColumnName = "numero", insertable = false, updatable = false)
    private Vivienda numero;
    @Column(name = "metros_c")
    private String metrosC;
    @Column(name = "od_casa")
    private String additInfoCasa;
    @ManyToOne
    @JoinColumn(name = "dni_cp", referencedColumnName = "dni")
    private Persona dni;
}
