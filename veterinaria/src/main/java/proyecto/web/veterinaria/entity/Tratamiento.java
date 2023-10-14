package proyecto.web.veterinaria.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Tratamiento {
    
    @Id
    @GeneratedValue
    //id generado automatico
    private Long id;

    //Atributos
    private LocalDate fecha;

    @JsonIgnore
    @ManyToOne
    private Veterinario veterinario;

    @JsonIgnore
    @ManyToOne
    private Mascota mascota;

    @ManyToOne
    private Droga droga;

    //Constructores
    public Tratamiento() {
        
    }

    public Tratamiento(LocalDate fecha) {
        this.fecha = fecha;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Droga getDroga() {
        return droga;
    }

    public void setDroga(Droga droga) {
        this.droga = droga;
    }
   
}
