package proyecto.web.veterinaria.Service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;


import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.service.ClienteService;

@SpringBootTest
@ActiveProfiles("test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class ClienteServiceTestNaive {

    @Autowired
    private ClienteService clienteService;

    @BeforeEach
    public void init(){
        Cliente cliente1 = new Cliente("Juan", "1234567895", "juan@correo", "123456789","Activo");
        Cliente cliente2 = new Cliente("Juan Pérez", "123456789", "juan@correo1.com", "123456789","Activo");

        clienteService.add(cliente1);
        clienteService.add(cliente2);        
    }

    @Test
    public void ClienteService_createCliente_Cliente(){
    
        //arrange
        Cliente cliente1 = new Cliente("Juan", "1234567895", "juan@correo", "123456789","Activo");
        Cliente cliente2 = new Cliente("Juan Pérez", "123456789", "juan@correo1.com", "123456789","Activo");

        //act
        Cliente newCliente = clienteService.add(cliente1);
        newCliente = clienteService.add(cliente2);

        //assert
        Assertions.assertThat(newCliente).isNotNull();
    }
    
    
}
