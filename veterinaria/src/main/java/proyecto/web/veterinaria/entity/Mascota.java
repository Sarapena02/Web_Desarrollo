package proyecto.web.veterinaria.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
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

    private List<Tratamiento> tratamientos = new ArrayList<>();

    //Constructores
    public Mascota() {
        
    }
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<Tratamiento> getTratamientos() {
        return tratamientos;
    }
    public void setTratamientos(List<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }
}
