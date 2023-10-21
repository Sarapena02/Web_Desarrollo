package proyecto.web.veterinaria.service;

import java.util.List;

import proyecto.web.veterinaria.entity.Tratamiento;

//Servicio de tratamiento
public interface TratamientoService {

    //Metodos de tratamiento

    List<Tratamiento> findTratamientosUltimoMes();

    List<Object> TratamientosPorMedicamentoEnelUltimoMes(List<Tratamiento> tratamientos);

    void add(Tratamiento tratamiento);
    
}
