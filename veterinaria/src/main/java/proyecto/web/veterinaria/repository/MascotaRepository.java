package proyecto.web.veterinaria.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.web.veterinaria.entity.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {

}
