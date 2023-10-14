package proyecto.web.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import proyecto.web.veterinaria.entity.Droga;
import proyecto.web.veterinaria.service.DrogaService;

@RestController
@RequestMapping("/drogas")
@CrossOrigin(origins = "http://localhost:4200")
public class DrogaController {
    
    @Autowired
    DrogaService drogaService;
    

    @GetMapping("/drogas")
    @Operation(summary = "Obtener todas las drogas")
    public List<Droga> getAll(){
        return drogaService.findAll();
    }

    @GetMapping("/top3")
    @Operation(summary = "Obtener las 3 drogas con mas unidades vendidas")
    public List<Droga> top3Drogas(){
        return drogaService.top3Drogas();
    }

    @GetMapping("/GananciasTotales")
    @Operation(summary = "Obtener las ganancias totales")
    public Long gananciasTotales(){
        return drogaService.gananciasTotales();
    }

    @GetMapping("/VentasTotales")
    @Operation(summary = "Obtener las ventas totales")
    public Long ventasTotales(){
        return drogaService.ventasTotales();
    }
}
