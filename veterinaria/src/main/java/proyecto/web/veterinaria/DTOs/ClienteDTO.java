package proyecto.web.veterinaria.DTOs;

import lombok.Data;

@Data
public class ClienteDTO {
    private String name;
    private String cedula;
    private String correo;
    private String celular;
}
