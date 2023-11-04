package proyecto.web.veterinaria.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Droga {
    
    @Id
    @GeneratedValue
    //id generado automatico
    private Long id;

    //Atributos
    private String nombre;
    private Long precioVenta;
    private Long precioCompra;
    private int unidadesDisponibles;
    private int unidadesVendidas;
    
    @JsonIgnore
    @OneToMany(mappedBy = "droga")
    private List<Tratamiento> tratamientos = new ArrayList<>();

    //Constructor
    public Droga(String nombre, Long precioVenta, Long precioCompra, int unidadesDisponibles, int unidadesVendidas) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.unidadesDisponibles = unidadesDisponibles;
        this.unidadesVendidas = unidadesVendidas;

    }
}
