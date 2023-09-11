package proyecto.web.veterinaria.service;

import java.util.Collection;

import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;

//servicio de cliente
public interface ClienteService {

    //metodos de cliente
    public Cliente SearchById(Long id);

    public Collection<Cliente> findAll();

    public void deleteById(Long id);

    public void updateById(Cliente cliente);

    public void add(Cliente cliente);

    public Cliente SearchByCedula(String cedula);

    public Collection<Mascota> findAllActivos(Long id);

    
}
