package proyecto.web.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import proyecto.web.veterinaria.entity.Tratamiento;
import proyecto.web.veterinaria.service.TratamientoService;

@RestController
@RequestMapping("/tratamientos")
@CrossOrigin(origins = "http://localhost:4200")
public class TratamientoController {
    
    @Autowired
    TratamientoService tratamientoService;

    @GetMapping("/ultimoMes")
    public int TramientosultimoMes(){
        return tratamientoService.findTratamientosUltimoMes().size();
    }

    @GetMapping("/all")
    @Operation(summary = "Obtener todos los tratamientos")
    public ResponseEntity <List<Tratamiento>> getAll(){
        List<Tratamiento> tratamientos = tratamientoService.findAll();

        ResponseEntity<List<Tratamiento>> response = new ResponseEntity<>(tratamientos, HttpStatus.OK);
        return response;
    }

    @GetMapping("/find/{id}")
    @Operation(summary = "Obtener un tratamiento por su id")
    public ResponseEntity<Tratamiento> SearchById(@PathVariable Long id){
        Tratamiento tratamiento = tratamientoService.SearchById(id);

        if(tratamiento == null){
            ResponseEntity<Tratamiento> response = new ResponseEntity<>(tratamiento, HttpStatus.NOT_FOUND);
            return response;
        }

        ResponseEntity<Tratamiento> response = new ResponseEntity<>(tratamiento, HttpStatus.OK);
        return response;
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Eliminar un tratamiento")
    public ResponseEntity<String> eliminarTratamiento(@PathVariable("id") Long id){
        // Se elimina el tratamiento con el id que se selecciono
        tratamientoService.deleteById(id);
        return new ResponseEntity<>("Tratamiento eliminado", HttpStatus.NO_CONTENT);
    }

    @PutMapping("/update/{id}")
    @Operation(summary = "Actualizar un tratamiento")
    public ResponseEntity<String> actualizarTratamiento(@PathVariable("id") Long id, @RequestBody Tratamiento tratamiento){
        // Se actualiza el tratamiento que se selecciono en el formulario
        tratamientoService.updateById(tratamiento);
        return new ResponseEntity<>("Tratamiento actualizado", HttpStatus.OK);
    }

    @GetMapping("/TratamientosPorMedicamentoEnelUltimoMes")
    @Operation(summary = "Obtener los tratamientos por medicamento en el ultimo mes")
    public List<Object> TratamientosPorMedicamentoEnelUltimoMes() {

        List<Tratamiento> tratamientos = tratamientoService.findTratamientosUltimoMes();
        return tratamientoService.TratamientosPorMedicamentoEnelUltimoMes(tratamientos);
    }

    @PostMapping("/agregar")
    @Operation(summary = "Agregar un nuevo tratamiento")
    public void agregarTratamiento(@RequestBody Tratamiento tratamiento){
        //se añade un nuevo tratamiento
        tratamientoService.add(tratamiento);
    }

    @GetMapping("/TratamientosPorVeterinario/{id}")
    @Operation(summary = "Obtener los tratamientos por veterinario")
    public ResponseEntity<List<Tratamiento>> TratamientosPorVeterinario(@PathVariable("id") Long id){

        List<Tratamiento> tratamientos = tratamientoService.TratamientosPorVeterinario(id);

        ResponseEntity<List<Tratamiento>> response = new ResponseEntity<>(tratamientos, HttpStatus.OK);
        return response;
    }

    @GetMapping("/TratamientosPorMascota/{id}")
    @Operation(summary = "Obtener los tratamientos por mascota")
    public ResponseEntity<List<Tratamiento>> TratamientosPorMascota(@PathVariable("id") Long id){
        
        List<Tratamiento> tratamientos = tratamientoService.TratamientosPorMascota(id);

        ResponseEntity<List<Tratamiento>> response = new ResponseEntity<>(tratamientos, HttpStatus.OK);
        return response;
    }

}
