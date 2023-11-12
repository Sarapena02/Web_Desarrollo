package proyecto.web.veterinaria.Controller;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import proyecto.web.veterinaria.controller.ClienteController;
import proyecto.web.veterinaria.service.ClienteService;
import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.Assert.assertNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;


@WebMvcTest(controllers = ClienteController.class)
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
public class ClienteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ClienteService clienteService;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void ClienteController_createCliente_Cliente() throws Exception {

        Cliente cliente = new Cliente("Sergio", "1", "sergio@correo", "123456789","Activo");

        when(clienteService.add(Mockito.any(Cliente.class))).thenReturn(cliente);

        ResultActions response =mockMvc.perform(
                post("/clientes/agregar")
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(cliente)));

                response.andExpect(status().isCreated())
                .andExpect(content().contentType("application/json"))
                //
                .andExpect(jsonPath("$.nombre").value(cliente.getNombre()))
                .andExpect(jsonPath("$.cedula").value(cliente.getCedula()));
    }

    @Test
    public void ClienteController_showClientes_ClienteList() throws Exception {

            when(clienteService.findAll()).thenReturn(List.of(
                new Cliente(
                    "Juan",
                    "1234567895", 
                    "juan@correo", 
                    "123456789",
                    "Activo"
                    ),
                new Cliente(
                    "Pedro",
                    "123456789",
                    "pedro@correo1.com",
                    "123456789",
                    "Activo"
                )
            )
        );

        ResultActions reponse = mockMvc.perform(get("/clientes/all"));


        reponse.andExpect(status().isOk())
        .andExpect(content().contentType("application/json"))
        .andExpect(jsonPath("$.size()").value(2));  
    }

    @Test  
    public void ClienteController_findByIdNull_Cliente() throws Exception {
        
        when(clienteService.SearchById(Mockito.anyLong())).thenReturn(
            null
        );

        ResultActions response = mockMvc.perform(
            get("/clientes/find/").param("id","1")
        );

        response.andExpect(status().isNotFound());
    }

    @Test
    public void ClienteController_findById_Cliente() throws Exception {

        when(clienteService.SearchById(1L)).thenReturn(
            new Cliente(
                "Juan",
                "1234567895", 
                "juan@correo", 
                "123456789",
                "Activo"
            )  
        );

        ResultActions response = mockMvc.perform(
            get("/clientes/find/1")
        );

        response.andExpect(status().isOk());
    }

    @Test
    public void ClienteController_findByCedulaNull_Cliente() throws Exception {

        String requestBody = "{\"cedula\": \"1\"}"; 
        
        when(clienteService.SearchByCedula(Mockito.anyString())).thenReturn(
            null
        );

        ResultActions response = mockMvc.perform(
            post("/clientes/login")
            .contentType("application/json")
            .content(requestBody)
        );

        response.andExpect(status().isNotFound());
    }

    @Test
    public void ClienteController_deleteById_Cliente() throws Exception {
    
        Mockito.doNothing().when(clienteService).deleteById(            new Cliente(
                "Juan",
                "1234567895", 
                "juan@correo", 
                "123456789",
                "Activo"
            ) );
    
        mockMvc.perform(delete("/clientes/delete/{id}", 1l))
               .andExpect(status().isNoContent());

        Cliente clienteEliminado = clienteService.SearchById(1L);
        assertNull(clienteEliminado);
    }

    @Test
    public void ClienteController_updateById_Cliente() throws Exception {

        Cliente clienteActualizado = new Cliente();
        clienteActualizado.setNombre("Nombre Actualizado");
        clienteActualizado.setCedula("Nueva Cédula");
        clienteActualizado.setCorreo("Nueva Correo");
        clienteActualizado.setCelular("Nuevo Celular");
        
        Mockito.doNothing().when(clienteService).updateById(clienteActualizado);

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(clienteActualizado);

        mockMvc.perform(MockMvcRequestBuilders
           .put("/clientes/update/{id}", 1l)
           .contentType("application/json")
           .content(requestBody))
           .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void ClienteController_findMascotasCliente_MascotaList() throws Exception {
        
        when(clienteService.getMascotas(1L)).thenReturn(List.of(
                new Mascota(
                    "Mascota 1",
                    "raza",
                    1,
                    "enfermedad",
                    "Activo",
                    "imagen"
                ),
                new Mascota(
                    "Mascota 2",
                    "raza",
                    1,
                    "enfermedad",
                    "Activo",
                    "imagen"
                )
            )
        );

        ResultActions reponse = mockMvc.perform(get("/clientes/mascotas/1"));


        reponse.andExpect(status().isOk())
        .andExpect(content().contentType("application/json"))
        .andExpect(jsonPath("$.size()").value(2));  


    }




    
}
