package proyecto.web.veterinaria.entity;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Tratamiento {
    
    @Id
    @GeneratedValue
    //id generado automatico
    private Long id;

    //Atributos
    private LocalDate fecha;

    @ManyToOne
    private Veterinario veterinario;

    @ManyToOne
    private Mascota mascota;

    @ManyToOne
    private Droga droga;

    //Constructor
    public Tratamiento(LocalDate fecha) {
        this.fecha = fecha;
    } 
}
