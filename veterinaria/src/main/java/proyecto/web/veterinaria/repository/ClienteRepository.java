package proyecto.web.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.web.veterinaria.entity.Cliente;


//repositorio de cliente
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    //busca un cliente por su cedula
    Cliente findByCedula(String cedula);
}
