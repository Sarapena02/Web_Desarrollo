package proyecto.web.veterinaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import proyecto.web.veterinaria.entity.Droga;

public interface DrogaRepository extends JpaRepository<Droga, Long> {

    @Query("select d from Droga d order by d.unidadesVendidas desc LIMIT 3")
    List<Droga> top3Drogas();

    @Query("select sum(d.unidadesVendidas * d.precioVenta - d.unidadesDisponibles * d.precioCompra) from Droga d")
    Long gananciasTotales();

    @Query("select sum(d.unidadesVendidas * d.precioVenta) from Droga d")
    Long ventasTotales();
    
}
