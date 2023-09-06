package proyecto.web.veterinaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.web.veterinaria.repository.DrogaRepository;

@Service
public class DrogaServiceImpl implements DrogaService{

    @Autowired
    DrogaRepository drogaRepository;
    
}
