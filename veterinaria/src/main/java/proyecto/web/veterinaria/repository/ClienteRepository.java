package proyecto.web.veterinaria.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import proyecto.web.veterinaria.entity.Cliente;

@Repository
public class ClienteRepository {

    private Map<Integer, Cliente> clientes = new HashMap<>();

    public ClienteRepository(){
        
        clientes.put(1, new Cliente("juan", "1000285546", "juan_hernandezr@javeriana.edu.co", "3191123456",1));
        clientes.put(2, new Cliente("juan2", "1000285546", "juan_hernandezr@javeriana.edu.co", "3191123456",2));
        clientes.put(3, new Cliente("juan3", "1000285546", "juan_hernandezr@javeriana.edu.co", "3191123456",3));
        clientes.put(4, new Cliente("juan4", "1000285546", "juan_hernandezr@javeriana.edu.co", "3191123456",4));
        clientes.put(5, new Cliente("juan5", "1000285546", "juan_hernandezr@javeriana.edu.co", "3191123456",5));

    }
    
}
