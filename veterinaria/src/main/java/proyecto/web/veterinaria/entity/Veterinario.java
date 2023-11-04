package proyecto.web.veterinaria.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Veterinario {
    @Id
    @GeneratedValue
    //id generado automatico
    private Long id;

    //Atributos
    private String nombre;
    private String cedula;
    @Transient
    private String Contrasenia;
    private String Especialidad;
    private String foto;
    private String estado;

    @JsonIgnore
    @OneToMany(mappedBy = "veterinario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tratamiento> tratamientos = new ArrayList<>();

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    private UserEntity user;

    //Constructor
    public Veterinario(String nombre, String cedula, String Contrasenia, String Especialidad, String foto, String estado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.Contrasenia = Contrasenia;
        this.Especialidad = Especialidad;
        this.foto = foto;
        this.estado = estado;
    }  
}
