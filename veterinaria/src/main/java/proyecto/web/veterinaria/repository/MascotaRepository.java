package proyecto.web.veterinaria.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import proyecto.web.veterinaria.entity.Mascota;

@Repository
public class MascotaRepository {

    private Map<Integer, Mascota> mascotas = new HashMap<>();

    public MascotaRepository(){
        mascotas.put(1, new Mascota("Jack", "Siames", 2, "NA", "Activo","/jack1.jpeg"));
        mascotas.put(2, new Mascota("Sasha", "Siames", 3, "Hipotrofia", "Activo",""));
        mascotas.put(3, new Mascota("Jack", "Siames", 2, "Hipotrofia", "Activo",""));
        mascotas.put(4, new Mascota("Jack", "Siames", 2, "Hipotrofia", "Activo",""));
        mascotas.put(5, new Mascota("Jack", "Siames", 2, "Hipotrofia", "Activo",""));
    }

    public Mascota findById(Integer id){
        return mascotas.get(id);
    }

    public Collection<Mascota> findAll(){
        return mascotas.values();
    }

    
}
