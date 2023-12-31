package proyecto.web.veterinaria.service;

import java.util.List;

import proyecto.web.veterinaria.entity.Droga;

//Servicio de droga
public interface DrogaService {

    List<Droga> findAll();

    List<Droga> top3Drogas();

    Long gananciasTotales();

    Long ventasTotales();

    void actualizarDroga(Droga droga);

    Droga findByName(String name);
    
}
