package proyecto.web.veterinaria.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.web.veterinaria.entity.Mascota;

//repositorio de mascota
public interface MascotaRepository extends JpaRepository<Mascota, Long> {

}
