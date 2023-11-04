package proyecto.web.veterinaria.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Mascota {

    @Id
    @GeneratedValue
    //id generado automatico
    private Long id;

    //Se agregan los atributos
    private String nombre;
    private String raza;
    private int edad;
    private String enfermedad;
    private String estado;
    private String imagen;

    
    //Cliente de la mascota con relacion de muchos a uno
    @ManyToOne
    private Cliente cliente;

    @JsonIgnore
    @OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tratamiento> tratamientos = new ArrayList<>();

    //Constructor
    public Mascota(String nombre, String raza, int edad, String enfermedad, String estado, String imagen) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.enfermedad = enfermedad;
        this.estado = estado;
        this.imagen = imagen;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
