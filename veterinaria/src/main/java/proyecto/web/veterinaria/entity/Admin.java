package proyecto.web.veterinaria.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Admin {

    @Id
    @GeneratedValue
    private Long id;

    private String cedula;
    @Transient
    private String contrasenia;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    private UserEntity user;

    public Admin(String cedula, String contrasenia) {
        this.cedula = cedula;
        this.contrasenia = contrasenia;
    }    
}
