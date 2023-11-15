package proyecto.web.veterinaria.DTOs;

import lombok.Data;

@Data
public class MascotaDTO {
    private String name;
    private String raza;
    private int edad;
    private String enfermedad;
    private String estado;
}
