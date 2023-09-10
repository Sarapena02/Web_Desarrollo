package proyecto.web.veterinaria.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;


//repositorio de cliente
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    //busca un cliente por su cedula
    Cliente findByCedula(String cedula);

    //busca mas mascotas activas de un cliente
    @Query("select m from Mascota m inner join Cliente c On m.cliente.id = c.id where c.id = ?1 and m.estado = 'Activo'")
    Collection<Mascota> findAllActivos(Long id);
}
