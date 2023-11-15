package proyecto.web.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.web.veterinaria.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    
}
