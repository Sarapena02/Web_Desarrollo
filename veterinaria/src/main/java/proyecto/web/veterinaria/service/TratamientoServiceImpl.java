package proyecto.web.veterinaria.service;

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
    public List<Tratamiento> findAll() {
       return tratamientoRepository.findAll();
    }

    @Override
    public Tratamiento SearchById(Long id) {
       return tratamientoRepository.findById(id).get();
    }

    @Override
    public void updateById(Tratamiento tratamiento) {
        tratamientoRepository.save(tratamiento);
    }

    @Override
    public void add(Tratamiento tratamiento) {
        tratamientoRepository.save(tratamiento);
    }

    @Override
    public void deleteById(Long id) {
        tratamientoRepository.deleteById(id);
    }
}
