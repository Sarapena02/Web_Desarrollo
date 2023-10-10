package proyecto.web.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import proyecto.web.veterinaria.entity.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
        @Query("select v from Veterinario v where v.cedula = ?1 and v.Contrasenia = ?2")
        Veterinario findByCedulaYContrasenia(String cedula, String contrasenia);

}
