package proyecto.web.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import proyecto.web.veterinaria.service.DrogaService;

@Controller
public class DrogaController {
    
    @Autowired
    DrogaService drogaService;
    
}
