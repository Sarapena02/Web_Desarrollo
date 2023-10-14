package proyecto.web.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/TratamientosPorMedicamentoEnelUltimoMes")
    @Operation(summary = "Obtener los tratamientos por medicamento en el ultimo mes")
    public List<Object> TratamientosPorMedicamentoEnelUltimoMes() {

        List<Tratamiento> tratamientos = tratamientoService.findTratamientosUltimoMes();

        
        return tratamientoService.TratamientosPorMedicamentoEnelUltimoMes(tratamientos);
    }

}
