package proyecto.web.veterinaria.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class ErrorControllerr extends RuntimeException{

    
    @ExceptionHandler(NotFoundException.class)
    public String error(Model model, NotFoundException e){
        model.addAttribute("id", e.getId());

        if (e.isCliente()) {
            return "Errores/pagina_error_cliente"; // Redirige a la página de error para clientes
        } else {
            return "Errores/pagina_error_mascota"; // Redirige a la página de error para mascotas
        }
    }
}
