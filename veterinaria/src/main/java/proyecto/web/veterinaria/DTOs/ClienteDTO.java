package proyecto.web.veterinaria.DTOs;

import lombok.Data;

@Data
public class ClienteDTO {
    private String nombre;
    private String cedula;
    private String correo;
    private String celular;
}
