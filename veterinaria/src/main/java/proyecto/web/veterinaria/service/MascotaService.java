package proyecto.web.veterinaria.service;

import java.util.Collection;


import proyecto.web.veterinaria.entity.Mascota;

//Servicio de Mascota
public interface MascotaService {

    //Metodos de mascota
    public Mascota SearchById(Long id);

    public Collection<Mascota> findAll();

    public void deleteById(Long id);

    public void updateById(Mascota mascota);

    public void add(Mascota mascota);

    public Collection<Mascota> findAllActivos();
}
