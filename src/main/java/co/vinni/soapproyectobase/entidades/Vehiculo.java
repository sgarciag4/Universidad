package co.vinni.soapproyectobase.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Vehiculos")
@Table(name = "VEHICULOS")
public class Vehiculo implements Serializable {
    @Id
    @NoArgsConstructor(strategy = GenerationType.SEQUENCE, generator = "SEQ_VEHICULOS" )
    @SequenceGenerator(name = "SEQ_VEHICULOS", sequenceName = "SEQ_VEHICULOS", allocationSize = 1)
    @Column(name = "EQU_PAIS", nullable = false)
    private String pais;

    @Column(name = "EQU_PRECIO", nullable = false)
    private long precio;

    @Column(name = "EQU_DEPARTAMENTO", nullable = false)
    private String departamento;

    @Column(name = "EQU_MUNICIPIO", nullable = false)
    private String municipio;

    @Column(name = "EQU_TIPOVEHICULO", nullable = false)
    private String tipo;

    @Column(name = "EQU_MARCAVEHICULO", nullable = false)
    private String marca;

    @Column(name = "EQU_FECHA", nullable = false)
    private Date fechaAdquisicion;


}
