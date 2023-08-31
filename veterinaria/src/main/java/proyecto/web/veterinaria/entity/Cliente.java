package proyecto.web.veterinaria.entity;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Integer id;
    private String nombre;
    private String cedula;
    private String correo;
    private String celular;
    private List<Integer> mascotasId = new ArrayList<>();

    public Cliente(String nombre, String cedula, String correo, String celular, Integer id, List<Integer> mascotasId) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.celular = celular;
        this.id = id;
        this.mascotasId = mascotasId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public List<Integer> getMascotasId() {
        return mascotasId;
    }

    public void setMascotasId(List<Integer> mascotasId) {
        this.mascotasId = mascotasId;
    }
}
