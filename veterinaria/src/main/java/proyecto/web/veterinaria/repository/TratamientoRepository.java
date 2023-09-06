package proyecto.web.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.web.veterinaria.entity.Tratamiento;

public interface TratamientoRepository extends JpaRepository<Tratamiento, Long> {
    
}
