package co.vinni.soapproyectobase.utilidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UtilidadArchivosTest {


    @Test
    @DisplayName("Test registrar objeto en archivo")
    void registrarObjeto() {
        Equipo equipo = new Equipo(1,"millos","Equipo de la capital Bogotá");
        boolean rta = UtilidadArchivos.guardar("prueba.txt", equipo);
        Assertions.assertTrue(rta);
    }
    @Test
    @DisplayName("Test registrar objeto en archivo")
    void leerObjeto() {
        Equipo equipo = new Equipo(1,"millos","Equipo de la capital Bogotá");
        UtilidadArchivos.guardar("prueba.txt", equipo);
        Equipo elequipo = (Equipo)UtilidadArchivos.obtener ("prueba.txt");
        System.out.println(elequipo);
        Assertions.assertNotNull(elequipo);
    }


}
