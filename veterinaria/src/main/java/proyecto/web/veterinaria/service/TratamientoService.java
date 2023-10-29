package proyecto.web.veterinaria.service;

import java.util.List;

import proyecto.web.veterinaria.entity.Tratamiento;

//Servicio de tratamiento
public interface TratamientoService {

    //Metodos de tratamiento

    public List<Tratamiento> findAll();

    public Tratamiento SearchById(Long id);

    public void deleteById(Long id);

    public void updateById(Tratamiento tratamiento);

    public List<Tratamiento> findTratamientosUltimoMes();

    public List<Object> TratamientosPorMedicamentoEnelUltimoMes(List<Tratamiento> tratamientos);

    public Tratamiento add(Tratamiento tratamiento);

    public List<Tratamiento> TratamientosPorVeterinario(Long id);

    public List<Tratamiento> TratamientosPorMascota(Long id);

    
}
