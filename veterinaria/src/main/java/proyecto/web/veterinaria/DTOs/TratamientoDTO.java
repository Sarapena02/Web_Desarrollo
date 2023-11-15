package proyecto.web.veterinaria.DTOs;

import java.time.LocalDate;

import lombok.Data;
import proyecto.web.veterinaria.entity.Droga;
import proyecto.web.veterinaria.entity.Mascota;
import proyecto.web.veterinaria.entity.Veterinario;

@Data
public class TratamientoDTO {
    private Long id;
    private LocalDate fecha;
    private Veterinario veterinario;
    private Mascota mascota;
    private Droga droga;
    
}
