package proyecto.web.veterinaria.repository;


import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import proyecto.web.veterinaria.entity.Cliente;

@Repository
public class ClienteRepository {

    private Map<Integer, Cliente> clientes = new HashMap<>();

    public ClienteRepository(){
        
        clientes.put(1, new Cliente("juan", "123", "j@gmail", "3191123456",1,Arrays.asList(1,2)));
        clientes.put(2, new Cliente("paula", "123", "p@gmail", "3191123456",2,Arrays.asList(3)));
        clientes.put(3, new Cliente("sara", "123", "s@gmail", "3191123456",3,Arrays.asList(4)));
        clientes.put(4, new Cliente("flowers", "123", "f@gmail", "3191123456",4,Arrays.asList(5)));
        clientes.put(5, new Cliente("juan5", "123", "j@gmail", "3191123456",5,Arrays.asList(6)));

    }
    
    public Cliente findById(Integer id){
        return clientes.get(id);
    }

    public Collection<Cliente> findAll(){
        return clientes.values();
    }

    public void deleteById(Integer id){
        clientes.remove(id);
    }

    public void updateById(Cliente cliente){
        clientes.put(cliente.getId(), cliente);
    }
    
    public void add(Cliente cliente){
        int tam = clientes.size();
        int lastId = clientes.get(tam).getId();
        cliente.setId(lastId + 1);
        clientes.put(lastId + 1, cliente);
    }

    public Cliente autenticar(String correo, String cedula){
        for(Cliente cliente : clientes.values()){
            if(cliente.getCorreo().equals(correo) && cliente.getCedula().equals(cedula)){
                return cliente;
            }
        }
        return null;
    }
}
