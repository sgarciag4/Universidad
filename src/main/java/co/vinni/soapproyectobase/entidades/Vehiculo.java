package co.vinni.soapproyectobase.entidades;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculo implements Serializable {

    private double precio;
    private String pais;
    private String departamento;
    private String municipio;
    private String tipo;
    private String marca;
    private Date fechaAdquisicion;
}
