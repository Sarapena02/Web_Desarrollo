package proyecto.web.veterinaria.service;

import java.util.List;

import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;

//servicio de cliente
public interface ClienteService {

    // metodos de cliente
    public Cliente SearchById(Long id);

    public List<Cliente> findAll();

    public void deleteById(Long id);

    public void updateById(Cliente cliente);

    public Cliente add(Cliente cliente);

    public Cliente SearchByCedula(String cedula);

    public List<Mascota> findMascotasActivas(Long id);

    public List<Mascota> getMascotas(Long id);

<<<<<<< Updated upstream
=======
    public List<Mascota> getMascotas(Long id);

    
>>>>>>> Stashed changes
}
