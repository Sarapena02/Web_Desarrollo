package proyecto.web.veterinaria.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;
    
    @Override
    public Cliente SearchById(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Collection<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public void updateById(Cliente cliente) {
        clienteRepository.updateById(cliente);
    }

    @Override
    public void add(Cliente cliente) {
        clienteRepository.add(cliente);
    }

    @Override
    public Cliente autenticar(String correo, String cedula) {
        return clienteRepository.autenticar(correo, cedula);
    }

    
}
