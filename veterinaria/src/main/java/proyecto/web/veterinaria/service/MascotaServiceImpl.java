package proyecto.web.veterinaria.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.web.veterinaria.entity.Mascota;
import proyecto.web.veterinaria.repository.MascotaRepository;

@Service
public class MascotaServiceImpl implements MascotaService{

    @Autowired
    MascotaRepository mascotaRepository;

    @Override
    public Mascota SearchById(Integer id) {
        return mascotaRepository.findById(id);
    }

    @Override
    public Collection<Mascota> findAll() {
        return mascotaRepository.findAll();
    }
    
}
