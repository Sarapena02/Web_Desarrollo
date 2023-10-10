package proyecto.web.veterinaria.service;

import java.util.Collection;

import proyecto.web.veterinaria.entity.Veterinario;

//Servicio de Veterinario
public interface VeterinarioService {

    //Metodos de Veterinario

    public Veterinario SearchById(Long id);

    public Collection<Veterinario> findAll();

    public void deleteById(Long id);

    public void updateById(Veterinario veterinario);

    public void add(Veterinario veterinario);

    public Veterinario SearchByCedulayContrasenia(String cedula, String contrasenia);

    
}
