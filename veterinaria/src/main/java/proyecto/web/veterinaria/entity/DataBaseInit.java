package proyecto.web.veterinaria.entity;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import jakarta.transaction.Transactional;
import proyecto.web.veterinaria.repository.ClienteRepository;
import proyecto.web.veterinaria.repository.MascotaRepository;

@Controller
@Transactional
public class DataBaseInit implements ApplicationRunner{

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    MascotaRepository mascotaRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        clienteRepository.save(new Cliente("Juan", "123456789", "juan@correo", "123456789"));
        clienteRepository.save(new Cliente("Pedro", "987654321", "pedro@correo", "987654321"));

        mascotaRepository.save(new Mascota("Jack", "Siames", 2, "NA", "Activo", "Imagenes/jack1.jpeg"));
        mascotaRepository.save(new Mascota("Sasha", "Siames", 3, "NA", "Activo", "Imagenes/gato1.jpeg"));

        //crear asociaciones
        Cliente cliente = clienteRepository.findById(1L).get();

        for(Mascota mascota : mascotaRepository.findAll()){
            mascota.setCliente(cliente);
            mascotaRepository.save(mascota);
        }
    }
    
}
