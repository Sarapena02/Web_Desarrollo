package proyecto.web.veterinaria.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import proyecto.web.veterinaria.entity.Mascota;
import proyecto.web.veterinaria.service.MascotaService;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    MascotaService mascotaService;

    //Muestra todas las mascotas existentes
    //localhost:8090/mascotas/all
    @GetMapping("/all")
    public List<Mascota> getAll() {
        //trae todas las mascotas activas de la base de datos
        return mascotaService.findAllActivos(); 
    }

    //Busca una mascota por su id en la url
    //localhost:8090/mascotas/find/{id}
    @GetMapping("/find/{id}")
    public Mascota buscarMascota(@PathVariable("id") Long id){
        //busca una mascota por su id
        Mascota mascota = mascotaService.SearchById(id);        
        return mascota;
    }


    /* 
    //Muestra el formulario para crear una nueva mascota
    //localhost:8090/mascotas/add
    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model){
        //se crea una nueva mascota vacia
        Mascota mascota = new Mascota("", "", 0, "", "", "");
        model.addAttribute("mascota", mascota);
        return "CRUD_Mascota/crear_mascota";
    }
    */

    //Se agrega una nueva mascota a la base de datos
    @PostMapping("/agregar")
    public void agregarMascota(@RequestBody Mascota mascota){
        //Se agrega la mascota que se selecciono en el formulario
        mascotaService.add(mascota);
    }

    //Se elimina una mascota de la base de datos por su id
    //localhost:8090/mascotas/delete/{id}
    @GetMapping("/delete/{id}")
    public void eliminarMascota(@PathVariable("id") Long id){
        //Se elimina la mascota con el id que se selecciono
        Mascota mascota = mascotaService.SearchById(id);
        mascota.setEstado("Inactivo");
        mascotaService.updateById(mascota);
    }

    /* 
    //Se muestra el formulario para actualizar una mascota en la base de datos
    //localhost:8090/mascotas/update/{id}
    @GetMapping("/update/{id}")
    public String actualizarMascota(@PathVariable("id") Long id, Model model){
        //Se busca la mascota por el id
        Mascota mascota = mascotaService.SearchById(id);
        model.addAttribute("mascota", mascota);
        return "CRUD_Mascota/actualizar_mascota";
    }
    */

    //Se actualiza una mascota en la base de datos
    @PostMapping("/update/{id}")
    public void actualizarMascota(@PathVariable("id") int id, @RequestBody Mascota mascota){
        //Se actualiza la mascota que se selecciono en el formulario
        mascotaService.updateById(mascota);        
    }

   
}
