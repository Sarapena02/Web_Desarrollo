package proyecto.web.veterinaria.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.web.veterinaria.entity.Veterinario;
import proyecto.web.veterinaria.service.VeterinarioService;

@RestController
@Controller
@RequestMapping("/veterinarios")
@CrossOrigin(origins = "http://localhost:4200")
public class VeterinarioController {

    @Autowired
    VeterinarioService veterinarioService;


    @PostMapping("/login")
    public Veterinario login(@RequestBody Map<String, String> requestBody) {
        //busca dentro de la base de datos el cliente que tenga la cedula
        Veterinario veterinario = veterinarioService.SearchByCedulayContrasenia(requestBody.get("cedula"), requestBody.get("contrasenia"));
  
        return veterinario;
    }

    //Se busca un veterinario por su id
    //localhost:8090/veterinarios/find/{id}
    @GetMapping("/find/{id}")
    public String buscarVeterinario(Model model, @PathVariable("id") Long id) {
            // Buscar un cliente por su ID
            Veterinario veterinario = veterinarioService.SearchById(id);
            model.addAttribute("veterinario", veterinario);
            return "CRUD_Veterinario/buscarVeterinario";
    }

    //Se muestra el formulario para mostrar los veterinarios
    //localhost:8090/veterinarios/all
    @GetMapping("/all")
    public String getAll(Model model) {
        //trae todos los clientes de la base de datos
        model.addAttribute("veterinarios", veterinarioService.findAll());
        return "CRUD_Veterinario/mostrarVeterinarios";
    }
    

    //Se muestra el formulario para crear un nuevo cliente
    //localhost:8090/clientes/add
    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {
        //se crea un nuevo cliente vacio
        Veterinario veterinario = new Veterinario("","", "", "", "");
        model.addAttribute("veterinario", veterinario);
        return "CRUD_Veterinario/crear_veterinario";
    }

    //Se agrega un nuevo veterinario a la base de datos
    @PostMapping("/agregar")
    public String agregarVeterinario(@ModelAttribute("veterinario") Veterinario veterinario, Model model) {
        //Se busca si ya existe un cliente con esa cedula
        Veterinario veterinarioExiste = veterinarioService.SearchByCedulayContrasenia(veterinario.getCedula(), veterinario.getContrasenia());
        //Si ya existe entonces se manda una alerta al formulario
        if(veterinarioExiste != null){
            model.addAttribute("alerta", "La cédula ya está registrada en el sistema.");
            return "CRUD_Veterinario/crear_veterinario";
        }else{
            //Se agrega el cliente que se selecciono en el formulario
            veterinarioService.add(veterinario);
            return "redirect:/veterinarios/all";
        }
    }

    //Se elimina un veterinario de la base de datos por su id
    //localhost:8090/veterinarios/delete/{id}
    @GetMapping("/delete/{id}")
    public String eliminarVeterinario(@PathVariable("id") Long id) {
        //Se elimina el veterinario con el id que se selecciono
        veterinarioService.deleteById(id);
        return "redirect:/veterinarios/all";
    }

    //Se muestra el formulario para actualizar a un veterinario en la base de datos
    //localhost:8090/veterinario/update/{id}
    @GetMapping("/update/{id}")
    public String actualizarVeterinario(@PathVariable("id") Long id, Model model) {
        //Se busca el cliente por el id
        Veterinario veterinario = veterinarioService.SearchById(id);
        model.addAttribute("veterinario", veterinario);
        return "CRUD_Veterinario/actualizar_veterinario";
    }

    //Se actualiza un Veterinario en la base de datos
    @PostMapping("/update/{id}")
    public String actualizarVeterinario(@PathVariable("id") int id, @ModelAttribute("veterinario") Veterinario veterinario) {
        //Se actualiza el cliente que se selecciono en el formulario
        veterinarioService.updateById(veterinario);
        return "redirect:/veterinarios/all";
    }
}
