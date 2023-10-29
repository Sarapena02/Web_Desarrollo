package proyecto.web.veterinaria.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.RequestBody;

import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;
import proyecto.web.veterinaria.service.MascotaService;

@RestController
@RequestMapping("/mascotas")
@CrossOrigin(origins = "http://localhost:4200")
public class MascotaController {

    @Autowired
    MascotaService mascotaService;

    //Muestra todas las mascotas existentes
    //localhost:8090/mascotas/all
    @GetMapping("/all")
    @Operation(summary = "Obtener todas las Mascotas")
    public List<Mascota> getAll() {
        //trae todas las mascotas activas de la base de datos
        return mascotaService.findAllActivos(); 
    }

    //Busca una mascota por su id en la url
    //localhost:8090/mascotas/find/{id}
    @GetMapping("/find/{id}")
    @Operation(summary = "Obtener una Mascota por su id")
    public Mascota buscarMascota(@PathVariable("id") Long id){
        //busca una mascota por su id
        Mascota mascota = mascotaService.SearchById(id);        
        return mascota;
    }

    //Se agrega una nueva mascota a la base de datos
    @PostMapping("/agregar")
    @Operation(summary = "Agregar una nueva Mascota")
    public void agregarMascota(@RequestBody Mascota mascota){
        //Se agrega la mascota que se selecciono en el formulario
        mascotaService.add(mascota);
    }

    @GetMapping("/cliente/{id}")
    @Operation(summary = "Obtener el cliente de la mascota por su id")
    public Cliente findCliente(@PathVariable("id") Long id){
        return mascotaService.findClienteById(id);
    }

    //Se elimina una mascota de la base de datos por su id
    //localhost:8090/mascotas/delete/{id}
    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Eliminar una Mascota")
    public void eliminarMascota(@PathVariable("id") Long id){
        //Se elimina la mascota con el id que se selecciono
        Mascota mascota = mascotaService.SearchById(id);
        mascota.setEstado("Inactivo");
        mascotaService.deleteById(mascota);;
    }

    //Se actualiza una mascota en la base de datos
    @PutMapping("/update/{id}")
    @Operation(summary = "Actualizar una Mascota")
    public void actualizarMascota(@PathVariable("id") Long id, @RequestBody Mascota mascota){
        //Se actualiza la mascota que se selecciono en el formulario
        mascotaService.updateById(mascota);     
    }

    @GetMapping("/cantidad/activos")
    @Operation(summary = "Obtener la cantidad de mascotas activas")
    public int cantidadMascotasActivas(){
        return mascotaService.findAllActivos().size();
    }

    @GetMapping("/cantidad/inactivos")
    @Operation(summary = "Obtener la cantidad de mascotas inactivas")
    public int cantidadMascotasInactivas(){
        return mascotaService.findAllInactivos().size();
    }

   
}
