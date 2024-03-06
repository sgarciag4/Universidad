package co.vinni.soapproyectobase.repositorios;

import co.vinni.soapproyectobase.entidades.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RepositorioVehiculo extends JpaRepository<Vehiculo, Long>, JpaSpecificationExecutor<Vehiculo> {

  //  public boolean registrarVehiculo(Vehiculo vehiculo);



}
