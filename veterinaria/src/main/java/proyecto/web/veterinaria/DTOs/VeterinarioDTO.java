package proyecto.web.veterinaria.DTOs;

import lombok.Data;

@Data
public class VeterinarioDTO {

    private Long id;
    private String nombre;
    private String cedula;
    private String Especialidad;
    private String foto;
    private String estado;
}
