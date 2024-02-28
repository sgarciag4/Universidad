package co.vinni.soapproyectobase.controladores;

import co.vinni.soapproyectobase.entidades.Vehiculo;
import co.vinni.soapproyectobase.servicios.ServicioVehiculo;

public class ControladorVehiculo {

    ServicioVehiculo sv = new ServicioVehiculo();

    public boolean registrarVehiculo(Vehiculo vehiculo){
        return sv.registrarVehiculo(vehiculo);
    }

}
