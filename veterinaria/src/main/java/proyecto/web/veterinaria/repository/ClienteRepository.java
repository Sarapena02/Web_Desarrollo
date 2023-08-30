package proyecto.web.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.web.veterinaria.entity.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
