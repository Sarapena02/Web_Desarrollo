package proyecto.web.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import proyecto.web.veterinaria.service.VeterinarioService;

@Controller
public class VeterinarioController {

    @Autowired
    VeterinarioService veterinarioService;
    
}
