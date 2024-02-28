package co.vinni.soapproyectobase.controladores;

import co.vinni.soapproyectobase.entidades.Vehiculo;
import co.vinni.soapproyectobase.servicios.ServicioVehiculo;

import java.util.List;

public class ControladorVehiculo {

    ServicioVehiculo sv = new ServicioVehiculo();

    public boolean registrarVehiculo(Vehiculo vehiculo){
        return sv.registrarVehiculo(vehiculo);
    }


    public List obtenerArchivo(String nombreArchivo){
        return sv.obtenerVehiculo(nombreArchivo);
    }

}
