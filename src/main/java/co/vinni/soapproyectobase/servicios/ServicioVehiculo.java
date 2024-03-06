package co.vinni.soapproyectobase.servicios;

import co.vinni.soapproyectobase.dto.VehiculoDto;
import co.vinni.soapproyectobase.controladores.ControladorVehiculo;
import co.vinni.soapproyectobase.entidades.Vehiculo;
import co.vinni.soapproyectobase.repositorios.RepositorioVehiculo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import co.vinni.soapproyectobase.utilidades.UtilidadArchivos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.Serializable;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;


public class ServicioVehiculo implements  Serializable  {

    private ModelMapper modelMapper;

    @Autowired
    RepositorioVehiculo repoVehiculo;

    public void registrarVehiculo (Vehiculo vehiculo){
        repoVehiculo.save(modelMapper.map(VehiculoDto, Vehiculo.class));
    }
    public List <VehiculoDto> obtenerVehiculos(){
        TypeToken<List<VehiculoDto>> typeToken = new TypeToken<>(){};
        return modelMapper.map(repoVehiculo.findAll(), typeToken.getType());
    }

    }


