package proyecto.web.veterinaria.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import proyecto.web.veterinaria.entity.Tratamiento;

public interface TratamientoRepository extends JpaRepository<Tratamiento, Long> {
    
    //busca un Tratamiento por su id
    @Query("select t from Tratamiento t where t.id = ?1")
    Optional<Tratamiento> findById(Long id);


}
