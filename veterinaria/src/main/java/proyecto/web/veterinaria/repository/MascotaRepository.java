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
        mascotas.put(1, new Mascota("Jack", "Siames", 2, "NA", "Activo", "/Imagenes/jack1.jpeg",1));
        mascotas.put(2, new Mascota("Sasha", "Siames", 3, "NA", "Activo", "/Imagenes/gato1.jpg",2));
        mascotas.put(3, new Mascota("Paco", "Siames", 2, "NA", "Activo", "/Imagenes/gato2.jpg",3));
        mascotas.put(4, new Mascota("Simon", "Siames", 2, "NA", "Activo", "/Imagenes/gato3.jpg",4));
        mascotas.put(5, new Mascota("Luna", "Siames", 2, "NA", "Activo", "/Imagenes/gato4.jpg",5));
        mascotas.put(6, new Mascota("Manolo", "Siames", 2, "NA", "Activo", "/Imagenes/gato4.jpg",6));
        
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
