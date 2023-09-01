package proyecto.web.veterinaria.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import proyecto.web.veterinaria.entity.Mascota;
import proyecto.web.veterinaria.service.MascotaService;

@Controller
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    MascotaService mascotaService;

    //Muestra todas las mascotas existentes
    //localhost:8090/mascotas/all
    @GetMapping("/all")
    public String getAll(Model model) {
        //trae todas las mascotas de la base de datos
        model.addAttribute("mascotas", mascotaService.findAll());
        return "CRUD_Mascota/mostrarMascotas"; 
    }

    //Busca una mascota por su id en la url
    //localhost:8090/mascotas/find/{id}
    @GetMapping("/find/{id}")
    public String buscarMascota(Model model, @PathVariable("id") Long id){
        //busca una mascota por su id
        Mascota mascota = mascotaService.SearchById(id);
        if(mascota != null){
            model.addAttribute("mascota", mascota);
        }else{
            //throw new NotFoundException(id,false);
        }
        
        return "CRUD_Mascota/buscarMascota";
    }


    //Muestra el formulario para crear una nueva mascota
    //localhost:8090/mascotas/add
    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model){
        //se crea una nueva mascota vacia
        Mascota mascota = new Mascota("", "", 0, "", "", "");
        model.addAttribute("mascota", mascota);
        return "CRUD_Mascota/crear_mascota";
    }

    //Se agrega una nueva mascota a la base de datos
    @PostMapping("/agregar")
    public String agregarMascota(@ModelAttribute("mascota") Mascota mascota){
        //Se agrega la mascota que se selecciono en el formulario
        mascotaService.add(mascota);
        return "redirect:/mascotas/all";
    }

    //Se elimina una mascota de la base de datos por su id
    //localhost:8090/mascotas/delete/{id}
    @GetMapping("/delete/{id}")
    public String eliminarMascota(@PathVariable("id") Long id){
        //Se elimina la mascota con el id que se selecciono
        mascotaService.deleteById(id);
        return "redirect:/mascotas/all";
    }

    //Se muestra el formulario para actualizar una mascota en la base de datos
    //localhost:8090/mascotas/update/{id}
    @GetMapping("/update/{id}")
    public String actualizarMascota(@PathVariable("id") Long id, Model model){
        //Se busca la mascota por el id
        Mascota mascota = mascotaService.SearchById(id);
        model.addAttribute("mascota", mascota);
        return "CRUD_Mascota/actualizar_mascota";
    }

    //Se actualiza una mascota en la base de datos
    @PostMapping("/update/{id}")
    public String actualizarMascota(@PathVariable("id") int id, @ModelAttribute("mascota") Mascota mascota){
        //Se actualiza la mascota que se selecciono en el formulario
        mascotaService.updateById(mascota);
        return "redirect:/mascotas/all";
        
    }

   
}
