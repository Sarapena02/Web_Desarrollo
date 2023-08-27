package proyecto.web.veterinaria.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;
import proyecto.web.veterinaria.service.ClienteService;
import proyecto.web.veterinaria.service.MascotaService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @Autowired
    MascotaService mascotaService;

    @PostMapping("/login")
    public String login(@RequestParam String correo, @RequestParam String cedula, HttpSession session) {
        Cliente cliente = clienteService.autenticar(correo, cedula);
        if (cliente != null) {
            session.setAttribute("cliente", cliente);
            System.out.println("Cliente autenticado: " + cliente.getNombre());
            return "redirect:/clientes/find/" + cliente.getId();
        } else {
            System.out.println("Autenticación fallida para correo: " + correo);
            return "Inicio/LogIn";
        }
}


    @GetMapping("/all")
    public String getAll(Model model) {
        model.addAttribute("clientes", clienteService.findAll());
        return "CRUD_Cliente/mostrarClientes";
    }

    @GetMapping("/find/{id}")
    public String buscarCliente(Model model, @PathVariable("id") int id) {
        Cliente cliente = clienteService.SearchById(id);

        //buscar mascotas del cliente
        ArrayList<Mascota> mascotasCliente = new ArrayList<>();
        for(int i=0;i<cliente.getMascotasId().size();i++){
            Mascota mascota = mascotaService.SearchById(cliente.getMascotasId().get(i));
            mascotasCliente.add(mascota);
        }
        
        if (cliente != null) {
            model.addAttribute("cliente", cliente);
            model.addAttribute("mascotas", mascotasCliente);
        }
        return "CRUD_Cliente/buscarCliente";
    }

    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {
        Cliente cliente = new Cliente("", "", "", "", 0,Arrays.asList());
        model.addAttribute("cliente", cliente);
        return "CRUD_Cliente/crear_cliente";
    }

    @PostMapping("/agregar")
    public String agregarCliente(@ModelAttribute("cliente") Cliente cliente){
        clienteService.add(cliente);
        return "redirect:/clientes/all";
    }

    @GetMapping("/delete/{id}")
    public String eliminarCliente(@PathVariable("id") int id) {
        clienteService.deleteById(id);
        return "redirect:/clientes/all";
    }
    
    @GetMapping("/update/{id}")
    public String actualizarCliente(@PathVariable("id") int id, Model model) {
        Cliente cliente = clienteService.SearchById(id);
        model.addAttribute("cliente", cliente);
        return "CRUD_Cliente/actualizar_cliente";
    }

    @PostMapping("/update/{id}")
    public String actualizarCliente(@PathVariable("id") int id, @ModelAttribute("cliente") Cliente cliente) {
        clienteService.updateById(cliente);
        return "redirect:/clientes/all";
    }
}