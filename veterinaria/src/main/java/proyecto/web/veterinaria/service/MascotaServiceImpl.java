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
    public Mascota SearchById(Long id) {
        return mascotaRepository.findById(id).get();
    }

    @Override
    public Collection<Mascota> findAll() {
        return mascotaRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public void updateById(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public void add(Mascota mascota) {
        mascotaRepository.save(mascota);
    }
    
}
