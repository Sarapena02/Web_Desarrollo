package proyecto.web.veterinaria.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class ErrorController extends RuntimeException{
    
    @ExceptionHandler(NotFoundException.class)
    public String error(Model model, NotFoundException e){
        model.addAttribute("id", e.getId());
        return "Error/pagina_error";
        
    }
}
