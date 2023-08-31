package proyecto.web.veterinaria.entity;

public class Mascota {
    private Integer id;
    private String nombre;
    private String raza;
    private int edad;
    private String enfermedad;
    private String estado;
    private String imagen;

    public Mascota(String nombre, String raza, int edad, String enfermedad, String estado, String imagen, Integer id) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.enfermedad = enfermedad;
        this.estado = estado;
        this.imagen = imagen;
        this.id = id;
    }

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

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
