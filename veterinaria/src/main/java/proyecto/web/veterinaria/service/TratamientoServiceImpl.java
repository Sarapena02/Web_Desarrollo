package proyecto.web.veterinaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.web.veterinaria.repository.TratamientoRepository;

//Implementacion del servicio tratamiento
@Service
public class TratamientoServiceImpl implements TratamientoService {
    
    @Autowired
    TratamientoRepository tratamientoRepository;
}
