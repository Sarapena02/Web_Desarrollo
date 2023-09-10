package proyecto.web.veterinaria.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;
import proyecto.web.veterinaria.repository.ClienteRepository;

//Implementacion del servicio de cliente
@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;
    
    //Busca un cliente por su id
    @Override
    public Cliente SearchById(Long id) {
        return clienteRepository.findById(id).get();
    }

    //Devuelve todos los clientes
    @Override
    public Collection<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    //Elimina un cliente
    @Override
    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }

    //Actualiza un cliente
    @Override
    public void updateById(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    //Agrega un nuevo cliente
    @Override
    public void add(Cliente cliente) {
        clienteRepository.save(cliente);
    }
    
    //Busca un cliente por su cedula
    @Override
    public Cliente SearchByCedula(String cedula) {
        return clienteRepository.findByCedula(cedula);
    }

    //Devuelve todas las mascotas activas
    @Override
    public Collection<Mascota> findAllActivos(Long id) {
        return clienteRepository.findAllActivos(id);
    }

    
}
