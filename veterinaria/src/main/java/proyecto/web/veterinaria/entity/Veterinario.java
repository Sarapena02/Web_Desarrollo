package proyecto.web.veterinaria.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Veterinario {
    @Id
    @GeneratedValue
    //id generado automatico
    private Long id;

    //Atributos
    private String cedula;
    private String Contraseña;
    private String Especialidad;
    private String foto;
    private int numeroAtenciones;

    private List<Tratamiento> tratamientos = new ArrayList<>();

    //Constructores
    public Veterinario() {
        
    }

    public Veterinario(String cedula, String Contraseña, String Especialidad, String foto, int numeroAtenciones) {
        this.cedula = cedula;
        this.Contraseña = Contraseña;
        this.Especialidad = Especialidad;
        this.foto = foto;
        this.numeroAtenciones = numeroAtenciones;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getNumeroAtenciones() {
        return numeroAtenciones;
    }

    public void setNumeroAtenciones(int numeroAtenciones) {
        this.numeroAtenciones = numeroAtenciones;
    }

    public List<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }
    
}
