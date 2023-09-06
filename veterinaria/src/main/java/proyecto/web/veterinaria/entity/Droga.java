package proyecto.web.veterinaria.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Droga {
    
    @Id
    @GeneratedValue
    //id generado automatico
    private Long id;

    //Atributos
    private String nombre;
    private Long precio;

    private List<Tratamiento> tratamientos = new ArrayList<>();

    //Constructores
    public Droga() {
        
    }

    public Droga(String nombre, Long precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    


}
