package proyecto.web.veterinaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;

//repositorio de cliente
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // busca un cliente por su cedula
    @Query("select c from Cliente c where c.cedula = ?1")
    Cliente findByCedula(String cedula);

    // busca las mascotas activas de un cliente
    @Query("select m from Mascota m inner join Cliente c On m.cliente.id = c.id where c.id = ?1 and m.estado = 'Activo'")
    List<Mascota> findMacotasActivas(Long id);

    // busca las mascotas de un cliente
    @Query("select m from Mascota m inner join Cliente c On m.cliente.id = c.id where c.id = ?1")
    List<Mascota> getMascotas(Long id);
}
