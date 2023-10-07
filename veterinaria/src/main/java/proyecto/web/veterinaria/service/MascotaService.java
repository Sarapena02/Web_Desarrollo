package proyecto.web.veterinaria.service;

import java.util.List;

import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;

//Servicio de Mascota
public interface MascotaService {

    //Metodos de mascota
    public Mascota SearchById(Long id);

    public List<Mascota> findAll();

    public void deleteById(Long id);

    public void updateById(Mascota mascota);

    public void add(Mascota mascota);

    public List<Mascota> findAllActivos();

    public Cliente findClienteById(Long id);
}
