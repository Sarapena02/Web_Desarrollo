package proyecto.web.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import proyecto.web.veterinaria.entity.Tratamiento;
import proyecto.web.veterinaria.service.TratamientoService;

@Controller
public class TratamientoController {
    
    @Autowired
    TratamientoService tratamientoService;


    @GetMapping("/all")
    @Operation(summary = "Obtener todos los Tratamientos")
    public List<Tratamiento> getAll() {
        // trae todos los tratamientos de la base de datos
        return tratamientoService.findAll();      
    }


    @GetMapping("/find/{id}")
    @Operation(summary = "Obtener un Tratamiento por su id")
    public Tratamiento buscarTratamiento(@PathVariable("id") Long id) {
        // Buscar un Tratamiento por su ID
        Tratamiento tratamiento = tratamientoService.SearchById(id);
        return tratamiento;
    }

    @PostMapping("/agregar")
    @Operation(summary = "Agregar un Tratamiento")
    public void agregarTratamiento(@RequestBody Tratamiento tratamiento) {
        Tratamiento tratamientoExiste = tratamientoService.SearchById(tratamiento.getId());

        if (tratamientoExiste != null) {
            tratamientoService.updateById(tratamiento);
        } else {
            tratamientoService.add(tratamiento);
        }
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Eliminar un Tratamiento por su id")
    public void eliminarTratamiento(@PathVariable("id") Long id) {
        tratamientoService.deleteById(id);
    }
}
