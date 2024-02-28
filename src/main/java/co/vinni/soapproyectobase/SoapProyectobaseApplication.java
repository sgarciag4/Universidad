package co.vinni.soapproyectobase;

import co.vinni.soapproyectobase.controladores.ControladorVehiculo;
import co.vinni.soapproyectobase.entidades.Vehiculo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * author Vinni 2023
 */
@SpringBootApplication
public class SoapProyectobaseApplication {

    public static void main(String[] args) {

        ControladorVehiculo cv = new ControladorVehiculo();
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo vehiculo2 = new Vehiculo();
        Date fecha = new Date(124, 1, 27, 10, 30, 15);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        vehiculo.setPais("Ecuador");
        vehiculo.setPrecio(70000);
        vehiculo.setTipo("camioneta");
        vehiculo.setMunicipio("Bogota");
        vehiculo.setFechaAdquisicion(fecha);
        vehiculo.setMarca("audi");
        vehiculo.setDepartamento("Bogota");

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




        //SpringApplication.run(SoapProyectobaseApplication.class, args);
//        ControladorCuenta controlaCuenta = new ControladorCuenta();
//        Cuenta cuenta = new Cuenta();
//        cuenta.setNombre("pruebaCliente2");
//        cuenta.setApellidos("Transferencia2");
//        cuenta.setNumerodeCedula("10302");
//        cuenta.setTipoDocumento("cc");
//        cuenta.setSaldo(0);
//        cuenta.setActiva(true);
//        cuenta.setNumerodeCelular("32122212");
//        if(controlaCuenta.registrarCuenta(cuenta)){
//            System.out.printf("Usuario Registrado con Exito");
//        }else{
//            System.out.println("Usuario Existente");
//        }

        //hacer una consignacion por numero de cuenta

//        ControladorCuenta controlaCuenta = new ControladorCuenta();
//        if(!controlaCuenta.Consignacion(20000,133000,796123845)){
//            System.out.println("Consignacion invalida");
//        }
//        System.out.printf("Consigacion existosa");


        //hacer una consignacion por numero
//        ControladorCuenta controlaCuenta = new ControladorCuenta();
//        controlaCuenta.transferencia(3000,"320122321");



//        ControladorCuenta controlaCuenta = new ControladorCuenta();
//        ControladorCuenta controladorCuenta = new ControladorCuenta();
//        controladorCuenta.leerCuenta("Clientes");
//        controladorCuenta.leerCuenta("datoCuenta265439871");


        //ver estado de cuenta;
//        ControladorCuenta controladorCuenta = new ControladorCuenta();
//
//        cuenta = controladorCuenta.estadoCuenta("10301","346187295");
//        System.out.println(cuenta);
//        System.out.println("adasdas");
//        Scanner lectura = new Scanner (System.in);
//        ControladorCuenta controlaCuenta = new ControladorCuenta();
//        Cuenta cuenta = new Cuenta();
//        boolean salir = false;
//        while(!salir){
//            System.out.println("***Bienvenido a Cuenta***");
//            System.out.println("Marque una opción");
//            System.out.println("1. Creacion de cuenta");
//            System.out.println("2. Verificar estado de Cuenta ya existente");
//            System.out.println("3. Realizar una Consignacion a una Cuenta");
//            System.out.println("4. Realizar una Transferencia a un Numero Celular");
//            System.out.println("5. Salir");
//            int opc = lectura.nextInt();
//            switch (opc){
//                case 1:
//                    System.out.println("Digite su Nombre");
//                    cuenta.setNombre(lectura.next());
//                    System.out.println("Digite su Apellido");
//                    cuenta.setApellidos(lectura.next());
//                    System.out.println("Digite su Numero de identificacion");
//                    cuenta.setNumerodeCedula(lectura.next());
//                    System.out.println("Digite su tipo de documento");
//                    cuenta.setTipoDocumento(lectura.next());
//                    cuenta.setSaldo(0);
//                    cuenta.setActiva(true);
//                    System.out.println("Digite su Numero Celular");
//                    cuenta.setNumerodeCelular(lectura.next());
//                    if(controlaCuenta.registrarCuenta(cuenta)){
//                        System.out.printf("Gracias por Registrarse");
//                    }else{
//                        System.out.println("Usuario Existente");
//                   }
//                    break;
//                case 2:
//                    System.out.println("Digite el numero de cedula");
//                    String numeroCedula = lectura.next();
//                    System.out.println("Digite el numero de cuenta");
//                    String numeroCuenta = lectura.next();
//                    cuenta = controlaCuenta.estadoCuenta(numeroCedula,numeroCuenta);
//                    System.out.println(cuenta);
//                    break;
//                case 3:
//                    System.out.println();
//
//                if(!controlaCuenta.Consignacion(20000,133000,796123845)){
//                    System.out.println("Consignacion invalida");
//                }
//                System.out.printf("Consigacion existosa");
//                    case
//            }
//
//        }




    }

}
