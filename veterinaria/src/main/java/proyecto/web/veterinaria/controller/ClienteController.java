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
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import io.swagger.v3.oas.annotations.Operation;
import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;
import proyecto.web.veterinaria.entity.UserEntity;
import proyecto.web.veterinaria.repository.UserRepository;
import proyecto.web.veterinaria.security.CustomUserDetailsService;
import proyecto.web.veterinaria.security.JWTGenerator;
import proyecto.web.veterinaria.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JWTGenerator jwtGenerator;

    // se autentifica el cliente
    @PostMapping("/login")
    @Operation(summary = "Log in de cliente")
    public ResponseEntity login(@RequestBody Cliente cliente) {
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(cliente.getCedula(), "123")
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtGenerator.generateToken(authentication);

        return new ResponseEntity<>(token, HttpStatus.OK);
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

    @GetMapping("/details")
    public ResponseEntity<Cliente> buscarCliente(){

        //Obtiene el cliente que inicio sesion
        Cliente cliente = clienteService.SearchByCedula(
            SecurityContextHolder.getContext().getAuthentication().getName()
        );

        if(cliente == null){
            return new ResponseEntity<>(cliente, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(cliente, HttpStatus.OK);
        
    }

    // Se busca un cliente por su id y se muestra como un json
    // localhost:8090/clientes/find/{id}
    @GetMapping("/find/{id}")
    @Operation(summary = "Obtener un Cliente por su id")
    public ResponseEntity<Cliente> buscarClientea(@PathVariable("id") Long id) {
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
    public ResponseEntity <Cliente> agregarCliente(@RequestBody Cliente cliente) {

        if(userRepository.existsByUsername(cliente.getCedula())){
            return new ResponseEntity<Cliente>(cliente, HttpStatus.BAD_REQUEST);
        }

        UserEntity userEntity  = customUserDetailsService.ClienteToUser(cliente);
        cliente.setUser(userEntity);
        Cliente newCliente = clienteService.add(cliente);
         if (newCliente == null) {
                return new ResponseEntity<Cliente>(newCliente, HttpStatus.BAD_REQUEST);
            }
        return new ResponseEntity<Cliente>(newCliente, HttpStatus.CREATED);
                    
    }

    
    // Se elimina un cliente de la base de datos por su id
    // localhost:8090/clientes/delete/{id}
    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Eliminar un Cliente")
    public ResponseEntity<String> eliminarCliente(@PathVariable("id") Long id) {
        // Se elimina el cliente con el id que se selecciono
        Cliente cliente = clienteService.SearchById(id);
        cliente.setEstado("Inactivo");
        clienteService.deleteById(cliente);
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