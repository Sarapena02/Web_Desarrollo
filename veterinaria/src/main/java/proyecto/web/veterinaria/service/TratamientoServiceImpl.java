package proyecto.web.veterinaria.service;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.web.veterinaria.entity.Tratamiento;
import proyecto.web.veterinaria.repository.TratamientoRepository;

//Implementacion del servicio tratamiento
@Service
public class TratamientoServiceImpl implements TratamientoService {
    
    @Autowired
    TratamientoRepository tratamientoRepository;

    @Override
    public List<Tratamiento> findTratamientosUltimoMes() {
        LocalDate fechaActual = LocalDate.now();

        //fecha del primer dia y del ultimo dia del mes anterior
        LocalDate fechaInicio = fechaActual.minusMonths(1).with(TemporalAdjusters.firstDayOfMonth());
        LocalDate fechaFin = fechaActual.minusMonths(1).with(TemporalAdjusters.lastDayOfMonth());

        return tratamientoRepository.findTratamientosUltimoMes(fechaInicio,fechaFin);
    }

    @Override
    public List<Object> TratamientosPorMedicamentoEnelUltimoMes(List<Tratamiento> medicamentos) {
        return tratamientoRepository.TratamientosPorMedicamentoEnelUltimoMes(medicamentos);
    }

    @Override
<<<<<<< Updated upstream
    public Tratamiento add(Tratamiento tratamiento) {
        return tratamientoRepository.save(tratamiento);
    }

    @Override
    public List<Tratamiento> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
=======
    public void add(Tratamiento tratamiento) {
        tratamientoRepository.save(tratamiento);
>>>>>>> Stashed changes
    }
}
