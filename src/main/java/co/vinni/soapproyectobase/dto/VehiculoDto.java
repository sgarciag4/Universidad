package co.vinni.soapproyectobase.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class VehiculoDto  implements Serializable {
    private String pais;
    private long precio;
    private String departamento;
    private String municipio;
    private String tipo;
    private String marca;
    private Date fechaAdquisicion;
}
