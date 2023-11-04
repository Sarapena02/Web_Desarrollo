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
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue
    //id generado automatico
    private Long id;

    //Se agregan los atributos
    private String nombre;
    private String cedula;
    private String correo;
    private String celular;

    //lista de mascotas con relacion de uno a muchos
    @JsonIgnore
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mascota> mascotas = new ArrayList<>();

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    private UserEntity user;

    //Constructor
    public Cliente(String nombre, String cedula, String correo, String celular) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.celular = celular;
    }
}
