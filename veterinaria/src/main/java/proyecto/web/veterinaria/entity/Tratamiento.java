package proyecto.web.veterinaria.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Tratamiento {
    
    @Id
    @GeneratedValue
    //id generado automatico
    private Long id;

    //Atributos
    private Date fecha;

    private Veterinario veterinario;

    private Mascota mascota;

    private List<Droga> drogas = new ArrayList<>();

    //Constructores
    public Tratamiento() {
        
    }

    public Tratamiento(Date fecha) {
        this.fecha = fecha;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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

    public List<Droga> getDrogas() {
        return drogas;
    }

    public void setDrogas(List<Droga> drogas) {
        this.drogas = drogas;
    }
   
}
