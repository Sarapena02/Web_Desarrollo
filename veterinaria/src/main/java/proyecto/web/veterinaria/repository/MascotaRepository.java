package proyecto.web.veterinaria.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;

//repositorio de mascota
public interface MascotaRepository extends JpaRepository<Mascota, Long> {

    @Query("select m from Mascota m where m.estado = 'Activo'")
    List<Mascota> findAllActivos();

    @Query("select m.cliente from Mascota m where m.cliente.id = ?1")
    Cliente findClienteById(Long id);

}
