package proyecto.web.veterinaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;
import proyecto.web.veterinaria.repository.ClienteRepository;

//Implementacion del servicio de cliente
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    // Busca un cliente por su id
    @Override
    public Cliente SearchById(Long id) {
        return clienteRepository.findById(id).get();
    }

    // Devuelve todos los clientes
    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    // Elimina un cliente
    @Override
    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }

    // Actualiza un cliente
    @Override
    public void updateById(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    // Agrega un nuevo cliente
    @Override
    public Cliente add(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Busca un cliente por su cedula
    @Override
    public Cliente SearchByCedula(String cedula) {
        return clienteRepository.findByCedula(cedula);
    }

    // Devuelve todas las mascotas activas
    @Override
    public List<Mascota> findMascotasActivas(Long id) {
        return clienteRepository.findMacotasActivas(id);
    }

    @Override
    public List<Mascota> getMascotas(Long id) {
        return clienteRepository.getMascotas(id);
    }

<<<<<<< Updated upstream
=======
    @Override
    public List<Mascota> getMascotas(Long id) {
        return clienteRepository.getMascotas(id);
    }

    
>>>>>>> Stashed changes
}
