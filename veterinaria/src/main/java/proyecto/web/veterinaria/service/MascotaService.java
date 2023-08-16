package proyecto.web.veterinaria.service;

import java.util.Collection;

import proyecto.web.veterinaria.entity.Mascota;

public interface MascotaService {

    public Mascota SearchById(Integer id);

    public Collection<Mascota> findAll();
}
