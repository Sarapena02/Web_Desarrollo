package proyecto.web.veterinaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.web.veterinaria.entity.Droga;
import proyecto.web.veterinaria.repository.DrogaRepository;

@Service
public class DrogaServiceImpl implements DrogaService{

    @Autowired
    DrogaRepository drogaRepository;

    @Override
    public List<Droga> findAll() {
        return drogaRepository.findAll();
    }

    @Override
    public List<Droga> top3Drogas() {
        return drogaRepository.top3Drogas();
    }

    @Override
    public Long gananciasTotales() {
        return drogaRepository.gananciasTotales();
    }

    @Override
    public Long ventasTotales() {
        return drogaRepository.ventasTotales();
    }

    @Override
    public void actualizarDroga(Droga droga) {
        drogaRepository.save(droga);
    }
    
}
