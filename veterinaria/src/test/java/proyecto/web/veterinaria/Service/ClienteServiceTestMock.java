package proyecto.web.veterinaria.Service;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.springframework.test.context.ActiveProfiles;

import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.repository.ClienteRepository;
import proyecto.web.veterinaria.service.ClienteServiceImpl;

@ActiveProfiles("test")
@ExtendWith(MockitoExtension.class)
public class ClienteServiceTestMock {
    @Mock
    ClienteRepository clienteRepository;

    @InjectMocks
    private ClienteServiceImpl clienteService;

    @BeforeEach
    public void init(){
        
    }

    @Test
    public void ClienteService_createService_Cliente(){
    
        //arrange
         Cliente cliente1 = new Cliente("Juan", "1234567895", "juan@correo", "123456789");

        when(clienteRepository.save(cliente1)).thenReturn(
            cliente1
        );

        //act
        Cliente newCliente = clienteService.add(cliente1);

        //assert
        Assertions.assertThat(newCliente).isNotNull();
    
    }

    @Test
    public void  ClienteService_findAll_ClienteList(){
        //arrange
        when(clienteRepository.findAll()).thenReturn(
            List.of(
                 new Cliente("Juan", "1234567895", "juan@correo", "123456789"),
                 new Cliente("Juan Pérez", "123456789", "juan@correo1.com", "123456789")
            )
        );

        //act
        List<Cliente> clientes = clienteService.findAll();

        //assert
        Assertions.assertThat(clientes).isNotNull();
        Assertions.assertThat(clientes.size()).isEqualTo(2);
    }

    @Test
    public void  ClienteService_findById_Cliente(){
        //arrange
        when(clienteRepository.findById(1L)).thenReturn(
            Optional.of(
                new Cliente("Juan", "1234567895", "juan@correo", "123456789")
            )
        );
        //act
        Cliente cliente = clienteService.SearchById(1L);

        //assert
        Assertions.assertThat(cliente).isNotNull();

    }

    @Test
    public void  ClienteService_searchByCedula_Cliente(){
        //arrange
        when(clienteRepository.findByCedula("1234567895")).thenReturn(
            new Cliente("Juan", "1234567895", "juan@correo", "123456789")
        );
        
        //act
        Cliente cliente = clienteService.SearchByCedula("1234567895");

        //assert
        Assertions.assertThat(cliente).isNotNull();
        
    }
}

