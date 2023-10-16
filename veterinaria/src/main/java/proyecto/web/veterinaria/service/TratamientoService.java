package proyecto.web.veterinaria.service;

import java.util.List;

import proyecto.web.veterinaria.entity.Tratamiento;

//Servicio de tratamiento
public interface TratamientoService {

    List<Tratamiento> findAll();

    Tratamiento SearchById(Long id);

    void updateById(Tratamiento tratamiento);

    void add(Tratamiento tratamiento);

    void deleteById(Long id);
    
}
