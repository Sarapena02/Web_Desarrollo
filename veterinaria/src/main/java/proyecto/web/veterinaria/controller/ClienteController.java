package proyecto.web.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.models.headers.Header.StyleEnum;
import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;
import proyecto.web.veterinaria.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    // se autentifica el cliente
    @PostMapping("/login")
    @Operation(summary = "Log in de cliente")
    public ResponseEntity<Cliente> login(@RequestBody String cedula) {
        // busca dentro de la base de datos el cliente que tenga la cedula
        Cliente cliente = clienteService.SearchByCedula(cedula);
        if(cliente == null){
            ResponseEntity<Cliente> response = new ResponseEntity<>(cliente, HttpStatus.NOT_FOUND);
            return response;
        }
        ResponseEntity<Cliente> response = new ResponseEntity<>(cliente, HttpStatus.OK);
        return response;
    }

    // Se muestra la lista de todos los clientes en formato json
    // localhost:8090/clientes/all
    @GetMapping("/all")
    @Operation(summary = "Obtener todos los Clientes")
    public ResponseEntity<List<Cliente>> getAll() {
        // trae todos los clientes de la base de datos
        List<Cliente> lista = clienteService.findAll();

        ResponseEntity<List<Cliente>> response = new ResponseEntity<>(lista, HttpStatus.OK);
        return response;
    }

    // Se busca un cliente por su id y se muestra como un json
    // localhost:8090/clientes/find/{id}
    @GetMapping("/find/{id}")
    @Operation(summary = "Obtener un Cliente por su id")
    public ResponseEntity<Cliente> buscarCliente(@PathVariable("id") Long id) {
        // Buscar un cliente por su ID
        Cliente cliente = clienteService.SearchById(id);

        if(cliente == null){
            ResponseEntity<Cliente> response = new ResponseEntity<>(cliente, HttpStatus.NOT_FOUND);
            return response;
        }

        ResponseEntity<Cliente> response = new ResponseEntity<>(cliente, HttpStatus.OK);

        return response;

    }

    // Se agrega un nuevo cliente a la base de datos
    @PostMapping("/agregar")
    @Operation(summary = "Agregar un nuevo Cliente")
    public ResponseEntity<Cliente> agregarCliente(@RequestBody Cliente cliente) {
        // Se busca si ya existe un cliente con esa cedula
        Cliente clienteExiste = clienteService.SearchByCedula(cliente.getCedula());
        // Si ya existe entonces se manda una alerta al formulario
        if (clienteExiste == null ) {
            Cliente newCliente = clienteService.add(cliente);
            if (newCliente == null) {
                ResponseEntity<Cliente> response = new ResponseEntity<>(newCliente, HttpStatus.BAD_REQUEST);
                return response;
            }
            ResponseEntity<Cliente> response = new ResponseEntity<>(newCliente, HttpStatus.CREATED);
            return response;
        }else{
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    
    // Se elimina un cliente de la base de datos por su id
    // localhost:8090/clientes/delete/{id}
    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Eliminar un Cliente")
    public ResponseEntity<String> eliminarCliente(@PathVariable("id") Long id) {
        // Se elimina el cliente con el id que se selecciono
        clienteService.deleteById(id);
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    // Se actualiza un cliente en la base de datos
    @PutMapping("/update/{id}")
    @Operation(summary = "Actualizar un Cliente")
    public ResponseEntity<String> actualizarCliente(@PathVariable("id") int id, @RequestBody Cliente cliente) {
        // Se actualiza el cliente que se selecciono en el formulario
        clienteService.updateById(cliente);
        return new ResponseEntity<>("{\"message\":\"Cliente actualizado\"}", HttpStatus.OK);
    }

    //Obtiene las mascotas de un cliente
    @GetMapping("/mascotas/{id}")
    @Operation(summary = "Obtener las mascotas de un cliente")
    public  ResponseEntity<List<Mascota>>  getMascotas(@PathVariable("id") Long id) {
        // Obtiene las mascotas de un cliente
        List<Mascota> mascotas = clienteService.getMascotas(id);
        return new ResponseEntity<>(mascotas, HttpStatus.OK);
    }

    @GetMapping("/cedula/{cedula}")
    @Operation(summary = "Obtener un cliente por su cedula")
    public ResponseEntity<Cliente> SearchByCedula(@PathVariable("cedula") String cedula){
        return new ResponseEntity<>(clienteService.SearchByCedula(cedula), HttpStatus.OK);
    }

}