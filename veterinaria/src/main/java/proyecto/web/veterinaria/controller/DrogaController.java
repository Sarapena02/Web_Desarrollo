package proyecto.web.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import proyecto.web.veterinaria.entity.Droga;
import proyecto.web.veterinaria.service.DrogaService;
import java.util.List;


@RestController
@RequestMapping("/drogas")
@CrossOrigin(origins = "http://localhost:4200")
public class DrogaController {
    
    @Autowired
    DrogaService drogaService;

    @GetMapping("/all")
    @Operation(summary = "Obtener todas las Drogas")
    public List<Droga> getAll() {
        return drogaService.findAll();
    }

    @GetMapping("/find/{id}")
    @Operation(summary = "Obtener una Drogas por su id")
    public Droga buscarDroga(@PathVariable("id") Long id) {
        Droga droga = drogaService.SearchById(id);

        return droga;
    }
    
}
