package proyecto.web.veterinaria.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import proyecto.web.veterinaria.entity.Tratamiento;

public interface TratamientoRepository extends JpaRepository<Tratamiento, Long> {
    
    @Query("select t from Tratamiento t where t.fecha >= ?1 and t.fecha <= ?2")
    List<Tratamiento> findTratamientosUltimoMes(LocalDate fechaInicio, LocalDate fechaFin);

    @Query("select t.droga.nombre, count(t) from Tratamiento t where t in ?1 group by t.droga.nombre")
    List<Object> TratamientosPorMedicamentoEnelUltimoMes(List<Tratamiento> medicamentos);
}
