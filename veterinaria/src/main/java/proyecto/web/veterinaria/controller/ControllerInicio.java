package proyecto.web.veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class ControllerInicio {

    @GetMapping("/inicio")
    public String inicio() {
        return "index";
    }

    @GetMapping("/inicio/LogIn.html")
    public String logIn() {
        return "LogIn";
    }
   
}
