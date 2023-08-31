package proyecto.web.veterinaria.service;

import java.util.Collection;

import proyecto.web.veterinaria.entity.Cliente;

public interface ClienteService {

    public Cliente SearchById(Integer id);

    public Collection<Cliente> findAll();

    public void deleteById(Integer id);

    public void updateById(Cliente cliente);

    public void add(Cliente cliente);

    public Cliente autenticar(String correo, String cedula);
}
