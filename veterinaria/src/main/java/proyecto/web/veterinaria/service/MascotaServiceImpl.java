package proyecto.web.veterinaria.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.web.veterinaria.entity.Mascota;
import proyecto.web.veterinaria.repository.MascotaRepository;

//Implementacion del servicio mascota
@Service
public class MascotaServiceImpl implements MascotaService{

    @Autowired
    MascotaRepository mascotaRepository;

    //Busca un mascota por su id
    @Override
    public Mascota SearchById(Long id) {
        return mascotaRepository.findById(id).get();
    }

    //Devuelve todos los mascotas
    @Override
    public Collection<Mascota> findAll() {
        return mascotaRepository.findAll();
    }

    //Elimina un mascota
    @Override
    public void deleteById(Long id) {
        mascotaRepository.deleteById(id);
    }

    //Actualiza un mascota
    @Override
    public void updateById(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    //Agrega un mascota
    @Override
    public void add(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public Collection<Mascota> findAllActivos(){
        return mascotaRepository.findAllActivos();
    }
    
}
