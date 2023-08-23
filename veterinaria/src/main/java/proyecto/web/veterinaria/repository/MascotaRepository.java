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

        mascotas.put(1, new Mascota("Jack", "Siames", 2, "Hipotrofia", "Activo", "/jack1.jpeg"));
        mascotas.put(2, new Mascota("Sasha", "Siames", 3, "Hipotrofia", "Activo", "https://estaticos-cdn.prensaiberica.es/clip/ce847ef4-8930-42e0-9c1d-9929902d3820_16-9-discover-aspect-ratio_default_0.jpg"));
        mascotas.put(3, new Mascota("Jack", "Siames", 2, "Hipotrofia", "Activo", "https://estaticos-cdn.prensaiberica.es/clip/ce847ef4-8930-42e0-9c1d-9929902d3820_16-9-discover-aspect-ratio_default_0.jpg"));
        mascotas.put(4, new Mascota("Jack", "Siames", 2, "Hipotrofia", "Activo", "https://estaticos-cdn.prensaiberica.es/clip/ce847ef4-8930-42e0-9c1d-9929902d3820_16-9-discover-aspect-ratio_default_0.jpg"));
        mascotas.put(5, new Mascota("Jack", "Siames", 2, "Hipotrofia", "Activo", "https://estaticos-cdn.prensaiberica.es/clip/ce847ef4-8930-42e0-9c1d-9929902d3820_16-9-discover-aspect-ratio_default_0.jpg"));
    }

    public Mascota findById(Integer id){
        return mascotas.get(id);
    }

    public Collection<Mascota> findAll(){
        return mascotas.values();
    }

    public void deleteById(Integer id){
        mascotas.remove(id);
    }

    public void updateById(Mascota mascota){
        mascotas.put(mascota.getId(), mascota);
    }
    
    public void add(Mascota mascota){
        int tam = mascotas.size();
        int lastId = mascotas.get(tam).getId();
        mascota.setId(lastId + 1);
        mascotas.put(lastId + 1, mascota);
    }
}
