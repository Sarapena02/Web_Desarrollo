package proyecto.web.veterinaria.service;

import java.util.Collection;

import proyecto.web.veterinaria.entity.Cliente;

public interface ClienteService {

    public Cliente SearchById(Long id);

    public Collection<Cliente> findAll();

    public void deleteById(Long id);

    public void updateById(Cliente cliente);

    public void add(Cliente cliente);

    //public Cliente autenticar(String correo, String cedula);
}
