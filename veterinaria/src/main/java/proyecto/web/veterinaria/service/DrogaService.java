package proyecto.web.veterinaria.service;

import java.util.List;

import proyecto.web.veterinaria.entity.Droga;

//Servicio de droga
public interface DrogaService {
    
    public List<Droga> findAll();

    public Droga SearchById(Long id);
}
