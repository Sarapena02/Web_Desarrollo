package proyecto.web.veterinaria.service;

import java.util.List;

import proyecto.web.veterinaria.entity.Veterinario;

//Servicio de Veterinario
public interface VeterinarioService {

    //Metodos de Veterinario

    public Veterinario SearchById(Long id);

    public List<Veterinario> findAll();

    public void deleteById(Veterinario veterinario);

    public void updateById(Veterinario veterinario);

    public void add(Veterinario veterinario);

    public Veterinario SearchByCedulayContrasenia(String cedula, String contrasenia);

    public List<Veterinario> findAllActivos();

    public List<Veterinario> findAllInactivos();

    
}
