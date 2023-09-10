package proyecto.web.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.web.veterinaria.entity.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {

        Veterinario findByCedula(String cedula);

    
}
