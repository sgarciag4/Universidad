package co.vinni.soapproyectobase.utilidades;

import co.vinni.soapproyectobase.entidades.Vehiculo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class UtilidadArchivos {

    public static boolean guardar(String archivo, List<Vehiculo> litasVehiculos){

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(litasVehiculos);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }



    public static List<Object> obtener(String archivo){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<Object>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }


}
