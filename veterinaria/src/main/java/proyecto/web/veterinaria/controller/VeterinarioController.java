package proyecto.web.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import proyecto.web.veterinaria.DTOs.VeterinarioDTO;
import proyecto.web.veterinaria.DTOs.VeterinarioMapper;
import proyecto.web.veterinaria.entity.UserEntity;
import proyecto.web.veterinaria.entity.Veterinario;
import proyecto.web.veterinaria.repository.UserRepository;
import proyecto.web.veterinaria.security.CustomUserDetailsService;
import proyecto.web.veterinaria.security.JWTGenerator;
import proyecto.web.veterinaria.service.VeterinarioService;

@RestController
@Controller
@RequestMapping("/veterinarios")
@CrossOrigin(origins = "http://localhost:4200")
public class VeterinarioController {

    @Autowired
    VeterinarioService veterinarioService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    CustomUserDetailsService customUserDetailsService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JWTGenerator jwtGenerator;


    @PostMapping("/login")
    @Operation(summary = "Log in de veterinario")
    public ResponseEntity login(@RequestBody Veterinario veterinario) {
        /*//busca dentro de la base de datos el cliente que tenga la cedula
        Veterinario veterinario = veterinarioService.SearchByCedula(requestBody.getCedula());
  
        return veterinario;*/
         Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(veterinario.getCedula(), veterinario.getContrasenia()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtGenerator.generateToken(authentication);

        return new ResponseEntity<String>(token, HttpStatus.OK);
    }

    @GetMapping("/details")
    public ResponseEntity buscarVeterinario(){

        //Obtiene el cliente que inicio sesion
        Veterinario veterinario = veterinarioService.SearchByCedula(
            SecurityContextHolder.getContext().getAuthentication().getName()
        );

        VeterinarioDTO veterinarioDTO = VeterinarioMapper.INSTANCE.convert(veterinario);

        if(veterinario == null){
            return new ResponseEntity<VeterinarioDTO>(veterinarioDTO, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<VeterinarioDTO>(veterinarioDTO, HttpStatus.OK);
        
    }

    //Se busca un veterinario por su id
    //localhost:8090/veterinarios/find/{id}
    @GetMapping("/find/{id}")
    @Operation(summary = "Obtener un Veterinario por su id")
    public Veterinario buscarVeterinarioa( @PathVariable("id") Long id) {
            // Buscar un cliente por su ID
            Veterinario veterinario = veterinarioService.SearchById(id);
            return veterinario;
    }

    //Se muestra el formulario para mostrar los veterinarios
    //localhost:8090/veterinarios/all
    @GetMapping("/all")
    @Operation(summary = "Obtener todos los Veterinarios")
    public List<Veterinario> getAll() {
        //trae todos los clientes de la base de datos
        return veterinarioService.findAll();
    }
    

    //Se muestra el formulario para crear un nuevo cliente
    //localhost:8090/clientes/add
    @PostMapping("/agregar")
    @Operation(summary = "Agregar un nuevo Veterinario")
    public ResponseEntity mostrarFormularioCrear(@RequestBody Veterinario veterinario) {
        if(userRepository.existsByUsername(veterinario.getCedula())){
            return new ResponseEntity<String>("este usuario ya existe",HttpStatus.BAD_REQUEST);
        }

        UserEntity userEntity  = customUserDetailsService.VeterinarioToUser(veterinario);
        veterinario.setUser(userEntity);
        Veterinario veterinarioDB = veterinarioService.add(veterinario);
        VeterinarioDTO newVeterinario = VeterinarioMapper.INSTANCE.convert(veterinarioDB);

         if (newVeterinario == null) {
                return new ResponseEntity<VeterinarioDTO>(newVeterinario, HttpStatus.BAD_REQUEST);
            }
        return new ResponseEntity<VeterinarioDTO>(newVeterinario, HttpStatus.CREATED);
    }

    //Se elimina un veterinario de la base de datos por su id
    //localhost:8090/veterinarios/delete/{id}
    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Eliminar un Veterinario")
    public void eliminarVeterinario(@PathVariable("id") Long id) {
        //Se elimina el veterinario con el id que se selecciono
        Veterinario veterinario = veterinarioService.SearchById(id);
        veterinario.setEstado("Inactivo");
        veterinarioService.deleteById(veterinario);
    }

    //Se actualiza un Veterinario en la base de datos
    @PutMapping("/update/{id}")
    @Operation(summary = "Actualizar un Veterinario")
    public void actualizarVeterinario(@PathVariable("id") Long id, @RequestBody Veterinario veterinario) {
        //Se actualiza el cliente que se selecciono en el formulario
        veterinarioService.updateById(veterinario);
    }

    @GetMapping("/cantidad/activos")
    @Operation(summary = "Obtener la cantidad de veterinarios activos")
    public int cantidadVeterinariosActivos() {
        return veterinarioService.findAllActivos().size();
    }

    @GetMapping("/cantidad/inactivos")
    @Operation(summary = "Obtener la cantidad de veterinarios inactivos")
    public int cantidadVeterinariosInactivos() {
        return veterinarioService.findAllInactivos().size();
    }
}
