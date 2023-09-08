package proyecto.web.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import proyecto.web.veterinaria.entity.Veterinario;
import proyecto.web.veterinaria.service.VeterinarioService;

@Controller
@RequestMapping("/veterinarios")
public class VeterinarioController {

    @Autowired
    VeterinarioService veterinarioService;


    @PostMapping("/login")
    public String login(@RequestParam String cedula, @RequestParam String contraseña, HttpSession session) {
        //busca dentro de la base de datos el cliente que tenga la cedula
        Veterinario veterinario = veterinarioService.SearchByCedula(cedula);
        if (veterinario != null) {
            //si lo encuentra redirecciona a la pagina donde esta toda su informacion
            session.setAttribute("veterinario", veterinario);
            return "redirect:/veterinarios/find/" + veterinario.getId();
        } else {
            //si no lo encuentra se vuelve a mostrar la pagina del login
            return "Inicio/logVet";
        }
    }

     @GetMapping("/find/{id}")
    public String buscarVeterinario(Model model, @PathVariable("id") Long id) {
            // Buscar un cliente por su ID
            Veterinario veterinario = veterinarioService.SearchById(id);
            model.addAttribute("veterinario", veterinario);
            return "CRUD_Veterinario/buscarVeterinario";

    }

    @GetMapping("/all")
    public String getAll(Model model) {
        //trae todos los clientes de la base de datos
        model.addAttribute("veterinarios", veterinarioService.findAll());
        return "CRUD_Veterinario/mostrarVeterinarios";
    }
    
}
