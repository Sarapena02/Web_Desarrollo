package proyecto.web.veterinaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.web.veterinaria.entity.Cliente;
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
    public List<Mascota> findAll() {
        return mascotaRepository.findAll();
    }

    //Elimina un mascota
    @Override
    public void deleteById(Mascota Mascota) {
        mascotaRepository.save(Mascota);
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
    public List<Mascota> findAllActivos(){
        return mascotaRepository.findAllActivos();
    }

    @Override
    public List<Mascota> findAllInactivos() {
        return mascotaRepository.findAllInactivos();
    }

    @Override
    public Cliente findClienteById(Long id) {
        return mascotaRepository.findClienteById(id);
    }

    @Override
    public Mascota findByName(String name) {
        return mascotaRepository.findByName(name);
    }
    
}
