package proyecto.web.veterinaria.controller;

public class NotFoundException extends RuntimeException{
    private int id;
    private boolean isCliente;

    public NotFoundException(int id, boolean isCliente) {
        this.id = id;
        this.isCliente = isCliente;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public boolean isCliente(){
        return isCliente;
    }

    public void setCliente(boolean isCliente){
        this.isCliente = isCliente;
    }

}
