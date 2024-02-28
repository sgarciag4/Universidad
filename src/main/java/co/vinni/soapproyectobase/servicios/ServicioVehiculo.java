package co.vinni.soapproyectobase.servicios;

import co.vinni.soapproyectobase.controladores.ControladorVehiculo;
import co.vinni.soapproyectobase.entidades.Vehiculo;
import co.vinni.soapproyectobase.repositorios.RepositorioVehiculo;
import co.vinni.soapproyectobase.utilidades.UtilidadArchivos;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class ServicioVehiculo implements RepositorioVehiculo, Serializable  {

    public boolean registrarVehiculo(Vehiculo vehiculo){

        return UtilidadArchivos.guardar("Vehiculos", vehiculo);
    }

    public static obtenerVehiculo(Vehiculo vehiculo){

        return UtilidadArchivos.obtener("Vehiculos", vehiculo);
    }


    public double depreciacion (LocalDate fechaVehiculo, double valor){
        LocalDate fechaActual = LocalDate.now();
        double total = 0;
        double porcentaje;
        Period periodo = Period.between(fechaVehiculo,fechaActual);

        int anosTrascurridos = periodo.getYears();

        if(anosTrascurridos < 1){
            return valor;
        }else if (anosTrascurridos > 1 && anosTrascurridos < 2){
            porcentaje = valor * 0.10;
            total = valor - porcentaje;
            return total;
        } else if (anosTrascurridos < 3) {
            porcentaje = valor * 0.20;
            total = valor - porcentaje;
            return total;
        }
        porcentaje = valor * 0.30;
        total = valor - porcentaje;
        return total;
    }

}
