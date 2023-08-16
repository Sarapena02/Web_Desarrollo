package proyecto.web.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import proyecto.web.veterinaria.entity.Mascota;
import proyecto.web.veterinaria.service.MascotaService;

@Controller
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    MascotaService mascotaService;

    //Muestra todas las mascotas existentes
    @GetMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("mascotas", mascotaService.findAll());
        return "mostrarMascotas"; 
    }

    //Busca una mascota por su id
    @GetMapping("/find/{id}")
    public String buscarMascota(Model model, @PathVariable("id") int id){
        Mascota mascota = mascotaService.SearchById(id);
        if(mascota != null)
        model.addAttribute("mascota", mascota);

        return "buscarMascota";
    }
    
}
