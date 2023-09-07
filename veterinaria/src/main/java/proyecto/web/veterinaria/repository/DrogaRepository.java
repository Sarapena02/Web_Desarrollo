package proyecto.web.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.web.veterinaria.entity.Droga;

public interface DrogaRepository extends JpaRepository<Droga, Long> {
    
}
