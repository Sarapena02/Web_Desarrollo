package proyecto.web.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    // se autentifica el cliente
    @PostMapping("/login")
    public Cliente login(@RequestBody String cedula) {
        // busca dentro de la base de datos el cliente que tenga la cedula
        System.out.println(cedula);
        Cliente cliente = clienteService.SearchByCedula(cedula);
       return cliente;
    }

    // Se muestra la lista de todos los clientes en formato json
    // localhost:8090/clientes/all
    @GetMapping("/all")
    @Operation(summary = "Obtener todos los Clientes")
    public List<Cliente> getAll() {
        // trae todos los clientes de la base de datos
        return clienteService.findAll();
    }

    // Se busca un cliente por su id y se muestra como un json
    // localhost:8090/clientes/find/{id}
    @GetMapping("/find/{id}")
    @Operation(summary = "Obtener un Cliente por su id")
    public Cliente buscarCliente(@PathVariable("id") Long id) {
        // Buscar un cliente por su ID
        Cliente cliente = clienteService.SearchById(id);

        return cliente;

    }

    /* 
    // Se muestra el formulario para crear un nuevo cliente
    // localhost:8090/clientes/add
    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {
        // se crea un nuevo cliente vacio
        Cliente cliente = new Cliente("", "", "", "");
        model.addAttribute("cliente", cliente);
        return "CRUD_Cliente/crear_cliente";
    }
    */

    // Se agrega un nuevo cliente a la base de datos
    @PostMapping("/agregar")
    @Operation(summary = "Agregar un nuevo Cliente")
    public void agregarCliente(@RequestBody Cliente cliente) {
        // Se busca si ya existe un cliente con esa cedula
        Cliente clienteExiste = clienteService.SearchByCedula(cliente.getCedula());
        // Si ya existe entonces se manda una alerta al formulario
        if (clienteExiste != null) {
        } else {
            // Se agrega el cliente que se selecciono en el formulario
            clienteService.add(cliente);
        }
    }

    
    // Se elimina un cliente de la base de datos por su id
    // localhost:8090/clientes/delete/{id}
    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Eliminar un Cliente")
    public void eliminarCliente(@PathVariable("id") Long id) {
        // Se elimina el cliente con el id que se selecciono
        clienteService.deleteById(id);
    }
    
    
    /*
    // Se muestra el formulario para actualizar a un cliente en la base de datos
    // localhost:8090/clientes/update/{id}
    @GetMapping("/update/{id}")
    public String actualizarCliente(@PathVariable("id") Long id, Model model) {
        // Se busca el cliente por el id
        Cliente cliente = clienteService.SearchById(id);
        model.addAttribute("cliente", cliente);
        return "CRUD_Cliente/actualizar_cliente";
    }
    */

    // Se actualiza un cliente en la base de datos
    @PostMapping("/update/{id}")
    @Operation(summary = "Actualizar un Cliente")
    public void actualizarCliente(@PathVariable("id") int id, @RequestBody Cliente cliente) {
        // Se actualiza el cliente que se selecciono en el formulario
        clienteService.updateById(cliente);
    }
}