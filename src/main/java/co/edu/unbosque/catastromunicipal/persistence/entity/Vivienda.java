package co.edu.unbosque.catastromunicipal.persistence.entity;

import jakarta.persistence.*;

@Entity
@IdClass(ViviendaPK.class)
public class Vivienda {
    @Id
    private int numero;
    @Id
    private String calle;
    @Column(name = "tipo_vivienda", length = 1)
    private String tipo;
    @Column(name = "codigo_postal", length = 5)
    private int codigoPostal;
    @Column(name = "metros", length = 5)
    private int metrosCuadrados;
    @Column(name = "od_vivienda")
    private String additInfoVivienda;
    @ManyToOne
    @JoinColumn(name = "nombre_zona", referencedColumnName = "nombre_zona")
    private ZonaUrbana zona;
}
