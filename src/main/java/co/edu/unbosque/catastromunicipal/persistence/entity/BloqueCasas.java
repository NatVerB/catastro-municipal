package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "BloqueCasas")
@IdClass(BloqueCasasPK.class)
public class BloqueCasas {
    @Id
    @OneToOne
    @JoinColumn(name = "numero", referencedColumnName = "numero", insertable = false, updatable = false)
    private Vivienda numVivienda;
    @Id
    @OneToOne
    @JoinColumn(name = "calle", referencedColumnName = "calle", insertable = false, updatable = false)
    private Vivienda calleVivienda;
    @Column(name = "metros_b")
    private int metrosBloque;
    @Column(name = "od_bloque")
    private String additInfoBloque;
}
