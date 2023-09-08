package proyecto.web.veterinaria.controller;

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
import proyecto.web.veterinaria.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    //se autentifica el cliente
    @PostMapping("/login")
    public String login(@RequestParam String cedula, HttpSession session) {
        //busca dentro de la base de datos el cliente que tenga la cedula
        Cliente cliente = clienteService.SearchByCedula(cedula);
        if (cliente != null) {
            //si lo encuentra redirecciona a la pagina donde esta toda su informacion
            session.setAttribute("cliente", cliente);
            return "redirect:/clientes/find/" + cliente.getId();
        } else {
            //si no lo encuentra se vuelve a mostrar la pagina del login
            return "Inicio/logInCliente";
        }
    }

    //Se muestra la lista de todos los clientes
    //localhost:8090/clientes/all
    @GetMapping("/all")
    public String getAll(Model model) {
        //trae todos los clientes de la base de datos
        model.addAttribute("clientes", clienteService.findAll());
        return "CRUD_Cliente/mostrarClientes";
    }

    //Se busca un cliente por su id
    //localhost:8090/clientes/find/{id}
    @GetMapping("/find/{id}")
    public String buscarCliente(Model model, @PathVariable("id") Long id) {
            // Buscar un cliente por su ID
            Cliente cliente = clienteService.SearchById(id);
            model.addAttribute("cliente", cliente);
            return "CRUD_Cliente/buscarCliente";

    }

    //Se muestra el formulario para crear un nuevo cliente
    //localhost:8090/clientes/add
    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {
        //se crea un nuevo cliente vacio
        Cliente cliente = new Cliente("", "", "", "");
        model.addAttribute("cliente", cliente);
        return "CRUD_Cliente/crear_cliente";
    }

    //Se agrega un nuevo cliente a la base de datos
    @PostMapping("/agregar")
    public String agregarCliente(@ModelAttribute("cliente") Cliente cliente, Model model) {
        //Se busca si ya existe un cliente con esa cedula
        Cliente clienteExiste = clienteService.SearchByCedula(cliente.getCedula());
        //Si ya existe entonces se manda una alerta al formulario
        if(clienteExiste != null){
            model.addAttribute("alerta", "La cédula ya está registrada en el sistema.");
            return "CRUD_Cliente/crear_cliente";
        }else{
            //Se agrega el cliente que se selecciono en el formulario
            clienteService.add(cliente);
            return "redirect:/clientes/all";
        }
    }

    //Se elimina un cliente de la base de datos por su id
    //localhost:8090/clientes/delete/{id}
    @GetMapping("/delete/{id}")
    public String eliminarCliente(@PathVariable("id") Long id) {
        //Se elimina el cliente con el id que se selecciono
        clienteService.deleteById(id);
        return "redirect:/clientes/all";
    }
    
    //Se muestra el formulario para actualizar a un cliente en la base de datos
    //localhost:8090/clientes/update/{id}
    @GetMapping("/update/{id}")
    public String actualizarCliente(@PathVariable("id") Long id, Model model) {
        //Se busca el cliente por el id
        Cliente cliente = clienteService.SearchById(id);
        model.addAttribute("cliente", cliente);
        return "CRUD_Cliente/actualizar_cliente";
    }

    //Se actualiza un cliente en la base de datos
    @PostMapping("/update/{id}")
    public String actualizarCliente(@PathVariable("id") int id, @ModelAttribute("cliente") Cliente cliente) {
        //Se actualiza el cliente que se selecciono en el formulario
        clienteService.updateById(cliente);
        return "redirect:/clientes/all";
    }
}