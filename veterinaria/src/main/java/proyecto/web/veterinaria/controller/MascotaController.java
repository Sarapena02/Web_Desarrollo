package proyecto.web.veterinaria.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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

    //Busca una mascota por su id en la url
    @GetMapping("/find/{id}")
    public String buscarMascota(Model model, @PathVariable("id") int id){
        Mascota mascota = mascotaService.SearchById(id);
        if(mascota != null){
            model.addAttribute("mascota", mascota);
        }else{
            throw new NotFoundException(id);
        }
        
        return "buscarMascota";
    }

    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model){
        Mascota mascota = new Mascota("", "", 0, "", "", "",0);
        model.addAttribute("mascota", mascota);
        return "crear_mascota";
    }

    @PostMapping("/agregar")
    public String agregarMascota(@ModelAttribute("mascota") Mascota mascota,@RequestParam("file") MultipartFile imagen) throws IOException{
        if (!imagen.isEmpty()) {
            Path directorioImagenes = Paths.get("src/main/resources/static");
            String rutaAbsoluta = directorioImagenes.toFile().getAbsolutePath();
    
            byte[] bytesImagen = imagen.getBytes();
            Path rutaCompleta = Paths.get(rutaAbsoluta + "/" + imagen.getOriginalFilename());
            Files.write(rutaCompleta, bytesImagen);
            mascota.setImagen(imagen.getOriginalFilename());
        }
        mascotaService.add(mascota);
        return "redirect:/mascotas/all";
    }

    @GetMapping("/delete/{id}")
    public String eliminarMascota(@PathVariable("id") int id){
        mascotaService.deleteById(id);
        return "redirect:/mascotas/all";
    }

    @GetMapping("/update/{id}")
    public String actualizarMascota(@PathVariable("id") int id, Model model){
        Mascota mascota = mascotaService.SearchById(id);
        model.addAttribute("mascota", mascota);
        return "actualizar_mascota";
    }

    @PostMapping("/update/{id}")
    public String actualizarMascota(@PathVariable("id") int id, @ModelAttribute("mascota") Mascota mascota){
        mascotaService.updateById(mascota);
        return "redirect:/mascotas/all";
        
    }

   
}
