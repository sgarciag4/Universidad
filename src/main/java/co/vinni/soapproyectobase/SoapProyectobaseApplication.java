package co.vinni.soapproyectobase;

import co.vinni.soapproyectobase.controladores.ControladorVehiculo;
import co.vinni.soapproyectobase.entidades.Vehiculo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * author Vinni 2023
 */
@SpringBootApplication
public class SoapProyectobaseApplication {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner datos = new Scanner (System.in);
        ControladorVehiculo cv = new ControladorVehiculo();
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo vehiculo2 = new Vehiculo();
        Date fecha = new Date(124, 1, 27, 10, 30, 15);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       // vehiculo.setPais("Ecuador");
        //   vehiculo.setPrecio(70000);
        //  vehiculo.setTipo("camioneta");
      //  vehiculo.setMunicipio("Bogota");
        vehiculo.setFechaAdquisicion(fecha);
       // vehiculo.setMarca("audi");
       // vehiculo.setDepartamento("Bogota");

        System.out.println("Bienvenido");

        System.out.println("Digite  el país:");
        vehiculo.setPais(datos.next());
        System.out.println("Digite  el Departamento:");
        vehiculo.setDepartamento(datos.next());
        System.out.println("Digite  el Municipio:");
        vehiculo.setMunicipio(datos.next());
//        System.out.println("Digite  fecha adquisición seguro:");
//        vehiculo.setFechaAdquisicion(datos());
        System.out.println("Digite  precio comercial del vehiculo:");
        vehiculo.setPrecio(datos.nextDouble());
        System.out.println("Digite  el tipo del vehiculo:");
        vehiculo.setTipo(datos.next());
        System.out.println("Digite  la marca del vehiculo:");
        vehiculo.setMarca(datos.next());


//        vehiculo2.setPais("Ecuador");
//        vehiculo2.setPrecio(70000);
//        vehiculo2.setTipo("Campero");
//        vehiculo2.setMunicipio("Quito");
//        vehiculo2.setFechaAdquisicion(fecha);
//        vehiculo2.setMarca("Toyota");
//        vehiculo2.setDepartamento("Sin muni");

        boolean guardado = cv.registrarVehiculo(vehiculo);
//        boolean guardado2 = cv.registrarVehiculo(vehiculo2);
        System.out.println(guardado);
//        System.out.println(guardado2);

        List vehiculo1 = cv.obtenerArchivo("Vehiculos");

        if (vehiculo1 != null) {
            System.out.println("Lista recuperada:");
            for (Object obj : vehiculo1) {
                System.out.println(obj);
            }
        }
    }

}
