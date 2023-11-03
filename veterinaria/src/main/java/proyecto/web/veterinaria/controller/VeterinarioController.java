package proyecto.web.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import proyecto.web.veterinaria.entity.Veterinario;
import proyecto.web.veterinaria.service.VeterinarioService;

@RestController
@Controller
@RequestMapping("/veterinarios")
@CrossOrigin(origins = "http://localhost:4200")
public class VeterinarioController {

    @Autowired
    VeterinarioService veterinarioService;


    @PostMapping("/login")
    @Operation(summary = "Log in de veterinario")
    public Veterinario login(@RequestBody Veterinario requestBody) {
        //busca dentro de la base de datos el cliente que tenga la cedula
        Veterinario veterinario = veterinarioService.SearchByCedula(requestBody.getCedula());
  
        return veterinario;
    }

    //Se busca un veterinario por su id
    //localhost:8090/veterinarios/find/{id}
    @GetMapping("/find/{id}")
    @Operation(summary = "Obtener un Veterinario por su id")
    public Veterinario buscarVeterinario( @PathVariable("id") Long id) {
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
    public void mostrarFormularioCrear(@RequestBody Veterinario veterinario) {
        //se añade un nuevo veterianario
        veterinarioService.add(veterinario);
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
