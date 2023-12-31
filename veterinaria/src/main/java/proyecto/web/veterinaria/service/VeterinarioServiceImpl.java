package proyecto.web.veterinaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.web.veterinaria.entity.Veterinario;
import proyecto.web.veterinaria.repository.VeterinarioRepository;

//Implementacion del servicio veterinario
@Service
public class VeterinarioServiceImpl implements VeterinarioService {

    @Autowired
    VeterinarioRepository veterinarioRepository;

     //Busca un cliente por su id
    @Override
    public Veterinario SearchById(Long id) {
        return veterinarioRepository.findById(id).get();
    }

    //Devuelve todos los clientes
    @Override
    public List<Veterinario> findAll() {
        return veterinarioRepository.findAll();
    }

    //Elimina un cliente
    @Override
    public void deleteById(Veterinario veterinario) {
        veterinarioRepository.save(veterinario);
    }

    //Actualiza un cliente
    @Override
    public void updateById(Veterinario cliente) {
        veterinarioRepository.save(cliente);
    }

    //Agrega un nuevo cliente
    @Override
    public Veterinario add(Veterinario cliente) {
       return veterinarioRepository.save(cliente);
    }

    @Override
    public Veterinario SearchByCedula(String cedula) {
        return veterinarioRepository.findByCedula(cedula);
    }

    @Override
    public List<Veterinario> findAllActivos() {
        return veterinarioRepository.findAllActivos();
    }
    
    @Override
    public List<Veterinario> findAllInactivos() {
        return veterinarioRepository.findAllInactivos();
    }
}
