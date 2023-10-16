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
	public Droga SearchById(Long id) {
        return drogaRepository.findById(id).get();
    }
    
}
