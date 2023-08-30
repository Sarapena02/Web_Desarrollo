package proyecto.web.veterinaria.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Cliente {

    @Id
    @GeneratedValue
    //id generado automatico
    private Long id;

    private String nombre;
    private String cedula;
    private String correo;
    private String celular;

    @OneToMany(mappedBy = "cliente")
    private List<Mascota> mascotas = new ArrayList<>();

    public Cliente() {
        
    }

    public Cliente(String nombre, String cedula, String correo, String celular) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.celular = celular;
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
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public List<Mascota> getMascotas() {
        return mascotas;
    }
    
    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
