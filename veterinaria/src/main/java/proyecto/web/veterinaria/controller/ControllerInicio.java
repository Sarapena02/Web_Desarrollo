package proyecto.web.veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class ControllerInicio {

    //landing page
    //localhost:8090
    @GetMapping()
    public String inicio() {
        return "Inicio/index";
    }

    //login de cliente
    //localhost:8090/logInCliente
    @GetMapping("/logInCliente")
    public String loginCliente() {
        return "Inicio/logInCliente";
    }

    //login de veterinario
    //localhost:8090/logInVet
    @GetMapping("/logInVet")
    public String loginVet() {
        return "Inicio/logInVet";
    }
   
}
