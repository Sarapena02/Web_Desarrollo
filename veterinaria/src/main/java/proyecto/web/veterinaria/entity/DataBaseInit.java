package proyecto.web.veterinaria.entity;


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
        //agregar clientes
        clienteRepository.save(new Cliente("Juan", "123456789", "juan@correo", "123456789"));
        clienteRepository.save(new Cliente("Pedro", "987654321", "pedro@correo", "987654321"));

        //agregar mascotas
        mascotaRepository.save(new Mascota("Jack", "Siames", 2, "NA", "Activo", "Imagenes/jack1.jpeg"));
        mascotaRepository.save(new Mascota("Sasha", "Siames", 3, "NA", "Activo", "Imagenes/gato1.jpeg"));
        mascotaRepository.save(new Mascota("Luna", "Persa", 2, "NA", "Activo", "Imagenes/gato2.jpeg"));
        mascotaRepository.save(new Mascota("Max", "Maine Coon", 4, "NA", "Activo", "Imagenes/gato3.jpeg"));
        mascotaRepository.save(new Mascota("Oliver", "Bengala", 1, "NA", "Activo", "Imagenes/gato4.jpeg"));
        mascotaRepository.save(new Mascota("Milo", "Sphynx", 2, "NA", "Activo", "Imagenes/gato5.jpeg"));
        mascotaRepository.save(new Mascota("Simba", "Ragdoll", 3, "NA", "Activo", "Imagenes/gato6.jpeg"));
        mascotaRepository.save(new Mascota("Charlie", "Abisinio", 2, "NA", "Activo", "Imagenes/gato7.jpeg"));
        mascotaRepository.save(new Mascota("Tiger", "Somalí", 5, "NA", "Activo", "Imagenes/gato8.jpeg"));
        mascotaRepository.save(new Mascota("Leo", "Oriental de Pelo Corto", 2, "NA", "Activo", "Imagenes/gato9.jpeg"));
        mascotaRepository.save(new Mascota("Oscar", "Siberiano", 4, "NA", "Activo", "Imagenes/gato10.jpeg"));
        mascotaRepository.save(new Mascota("Mia", "Siamés Moderno", 1, "NA", "Activo", "Imagenes/gato11.jpeg"));
        mascotaRepository.save(new Mascota("Jasper", "Azul Ruso", 3, "NA", "Activo", "Imagenes/gato12.jpeg"));
        mascotaRepository.save(new Mascota("Chloe", "Exótico de Pelo Corto", 2, "NA", "Activo", "Imagenes/gato13.jpeg"));
        mascotaRepository.save(new Mascota("Nala", "Birmano", 1, "NA", "Activo", "Imagenes/gato14.jpeg"));
        mascotaRepository.save(new Mascota("Mochi", "Fold Escocés", 4, "NA", "Activo", "Imagenes/gato15.jpeg"));
        mascotaRepository.save(new Mascota("Finn", "Británico de Pelo Corto", 2, "NA", "Activo", "Imagenes/gato16.jpeg"));
        mascotaRepository.save(new Mascota("Cleo", "Cornish Rex", 3, "NA", "Activo", "Imagenes/gato17.jpeg"));
        mascotaRepository.save(new Mascota("Loki", "Devon Rex", 1, "NA", "Activo", "Imagenes/gato18.jpeg"));
        mascotaRepository.save(new Mascota("Zoe", "Himalayo", 2, "NA", "Activo", "Imagenes/gato19.jpeg"));
        mascotaRepository.save(new Mascota("Misty", "Fold Escocés", 5, "NA", "Activo", "Imagenes/gato20.jpeg"));
        mascotaRepository.save(new Mascota("Salem", "Sphynx", 3, "NA", "Activo", "Imagenes/gato21.jpeg"));
        mascotaRepository.save(new Mascota("Mittens", "Van Turco", 2, "NA", "Activo", "Imagenes/gato22.jpeg"));
        mascotaRepository.save(new Mascota("Muffin", "Ragamuffin", 4, "NA", "Activo", "Imagenes/gato23.jpeg"));
        mascotaRepository.save(new Mascota("Snowball", "Bosque de Noruega", 1, "NA", "Activo", "Imagenes/gato24.jpeg"));
        mascotaRepository.save(new Mascota("Whiskers", "Highland Fold", 2, "NA", "Activo", "Imagenes/gato25.jpeg"));
        mascotaRepository.save(new Mascota("Tinkerbell", "Siamés Moderno", 3, "NA", "Activo", "Imagenes/gato26.jpeg"));
        mascotaRepository.save(new Mascota("Midnight", "Bombay", 2, "NA", "Activo", "Imagenes/gato27.jpeg"));
        mascotaRepository.save(new Mascota("Cupcake", "Fold Escocés", 1, "NA", "Activo", "Imagenes/gato28.jpeg"));
        mascotaRepository.save(new Mascota("Whiskey", "Siberiano", 4, "NA", "Activo", "Imagenes/gato29.jpeg"));
        mascotaRepository.save(new Mascota("Misty", "Somalí", 2, "NA", "Activo", "Imagenes/gato30.jpeg"));
        mascotaRepository.save(new Mascota("Angel", "Angora Turco", 3, "NA", "Activo", "Imagenes/gato31.jpeg"));
        mascotaRepository.save(new Mascota("Smokey", "Ragdoll", 1, "NA", "Activo", "Imagenes/gato32.jpeg"));
        mascotaRepository.save(new Mascota("Pumpkin", "Abisinio", 2, "NA", "Activo", "Imagenes/gato33.jpeg"));
        mascotaRepository.save(new Mascota("Ginger", "Persa", 5, "NA", "Activo", "Imagenes/gato34.jpeg"));
        mascotaRepository.save(new Mascota("Harley", "Maine Coon", 3, "NA", "Activo", "Imagenes/gato35.jpeg"));
        mascotaRepository.save(new Mascota("Snickers", "Azul Ruso", 2, "NA", "Activo", "Imagenes/gato36.jpeg"));
        mascotaRepository.save(new Mascota("Shadow", "Exótico de Pelo Corto", 1, "NA", "Activo", "Imagenes/gato37.jpeg"));
        mascotaRepository.save(new Mascota("Coco", "Ragamuffin", 4, "NA", "Activo", "Imagenes/gato38.jpeg"));
        mascotaRepository.save(new Mascota("Rocky", "Fold Escocés", 2, "NA", "Activo", "Imagenes/gato39.jpeg"));
        mascotaRepository.save(new Mascota("Salem", "Himalayo", 3, "NA", "Activo", "Imagenes/gato40.jpeg"));
        mascotaRepository.save(new Mascota("Simba", "Devon Rex", 1, "NA", "Activo", "Imagenes/gato41.jpeg"));
        mascotaRepository.save(new Mascota("Lily", "Cornish Rex", 2, "NA", "Activo", "Imagenes/gato42.jpeg"));
        mascotaRepository.save(new Mascota("Ruby", "Sphynx", 5, "NA", "Activo", "Imagenes/gato43.jpeg"));
        mascotaRepository.save(new Mascota("Mochi", "Ragdoll", 3, "NA", "Activo", "Imagenes/gato44.jpeg"));
        mascotaRepository.save(new Mascota("Charlie", "Fold Escocés", 2, "NA", "Activo", "Imagenes/gato45.jpeg"));
        mascotaRepository.save(new Mascota("Tiger", "Van Turco", 1, "NA", "Activo", "Imagenes/gato46.jpeg"));
        mascotaRepository.save(new Mascota("Mittens", "Birmano", 4, "NA", "Activo", "Imagenes/gato47.jpeg"));
        mascotaRepository.save(new Mascota("Chloe", "Siamés Moderno", 2, "NA", "Activo", "Imagenes/gato48.jpeg"));
        mascotaRepository.save(new Mascota("Nala", "Siberiano", 3, "NA", "Activo", "Imagenes/gato49.jpeg"));
        mascotaRepository.save(new Mascota("Finn", "Somalí", 1, "NA", "Activo", "Imagenes/gato50.jpeg"));
        mascotaRepository.save(new Mascota("Cleo", "Persa", 2, "NA", "Activo", "Imagenes/gato51.jpeg"));
        mascotaRepository.save(new Mascota("Salem", "Maine Coon", 5, "NA", "Activo", "Imagenes/gato52.jpeg"));
        mascotaRepository.save(new Mascota("Misty", "Angora Turco", 3, "NA", "Activo", "Imagenes/gato53.jpeg"));
        mascotaRepository.save(new Mascota("Smokey", "Ragamuffin", 2, "NA", "Activo", "Imagenes/gato54.jpeg"));
        mascotaRepository.save(new Mascota("Midnight", "Oriental de Pelo Corto", 1, "NA", "Activo", "Imagenes/gato55.jpeg"));
        mascotaRepository.save(new Mascota("Cupcake", "Bengala", 4, "NA", "Activo", "Imagenes/gato56.jpeg"));
        mascotaRepository.save(new Mascota("Whiskey", "Sphynx", 2, "NA", "Activo", "Imagenes/gato57.jpeg"));
        mascotaRepository.save(new Mascota("Misty", "Azul Ruso", 3, "NA", "Activo", "Imagenes/gato58.jpeg"));
        mascotaRepository.save(new Mascota("Angel", "Exótico de Pelo Corto", 1, "NA", "Activo", "Imagenes/gato59.jpeg"));
        mascotaRepository.save(new Mascota("Salem", "Birmano", 2, "NA", "Activo", "Imagenes/gato60.jpeg"));
        mascotaRepository.save(new Mascota("Simba", "Ragdoll", 5, "NA", "Activo", "Imagenes/gato61.jpeg"));
        mascotaRepository.save(new Mascota("Lily", "Abisinio", 3, "NA", "Activo", "Imagenes/gato62.jpeg"));
        mascotaRepository.save(new Mascota("Ruby", "Devon Rex", 2, "NA", "Activo", "Imagenes/gato63.jpeg"));
        mascotaRepository.save(new Mascota("Mochi", "Himalayo", 1, "NA", "Activo", "Imagenes/gato64.jpeg"));
        mascotaRepository.save(new Mascota("Charlie", "Cornish Rex", 4, "NA", "Activo", "Imagenes/gato65.jpeg"));
        mascotaRepository.save(new Mascota("Tiger", "Sphynx", 2, "NA", "Activo", "Imagenes/gato66.jpeg"));
        mascotaRepository.save(new Mascota("Mittens", "Fold Escocés", 3, "NA", "Activo", "Imagenes/gato67.jpeg"));
        mascotaRepository.save(new Mascota("Chloe", "Van Turco", 1, "NA", "Activo", "Imagenes/gato68.jpeg"));
        mascotaRepository.save(new Mascota("Nala", "Ragamuffin", 2, "NA", "Activo", "Imagenes/gato69.jpeg"));
        mascotaRepository.save(new Mascota("Finn", "Somalí", 5, "NA", "Activo", "Imagenes/gato70.jpeg"));
        mascotaRepository.save(new Mascota("Cleo", "Persa", 3, "NA", "Activo", "Imagenes/gato71.jpeg"));
        mascotaRepository.save(new Mascota("Salem", "Maine Coon", 2, "NA", "Activo", "Imagenes/gato72.jpeg"));
        mascotaRepository.save(new Mascota("Misty", "Bengala", 1, "NA", "Activo", "Imagenes/gato73.jpeg"));
        mascotaRepository.save(new Mascota("Smokey", "Sphynx", 4, "NA", "Activo", "Imagenes/gato74.jpeg"));
        mascotaRepository.save(new Mascota("Midnight", "Exótico de Pelo Corto", 2, "NA", "Activo", "Imagenes/gato75.jpeg"));
        mascotaRepository.save(new Mascota("Cupcake", "Siberiano", 3, "NA", "Activo", "Imagenes/gato76.jpeg"));
        mascotaRepository.save(new Mascota("Whiskey", "Ragdoll", 1, "NA", "Activo", "Imagenes/gato77.jpeg"));
        mascotaRepository.save(new Mascota("Misty", "Abisinio", 2, "NA", "Activo", "Imagenes/gato78.jpeg"));
        mascotaRepository.save(new Mascota("Angel", "Devon Rex", 5, "NA", "Activo", "Imagenes/gato79.jpeg"));
        mascotaRepository.save(new Mascota("Salem", "Himalayo", 3, "NA", "Activo", "Imagenes/gato80.jpeg"));
        mascotaRepository.save(new Mascota("Simba", "Cornish Rex", 2, "NA", "Activo", "Imagenes/gato81.jpeg"));
        mascotaRepository.save(new Mascota("Lily", "Fold Escocés", 1, "NA", "Activo", "Imagenes/gato82.jpeg"));
        mascotaRepository.save(new Mascota("Ruby", "Van Turco", 4, "NA", "Activo", "Imagenes/gato83.jpeg"));
        mascotaRepository.save(new Mascota("Mochi", "Ragamuffin", 2, "NA", "Activo", "Imagenes/gato84.jpeg"));
        mascotaRepository.save(new Mascota("Charlie", "Sphynx", 3, "NA", "Activo", "Imagenes/gato85.jpeg"));
        mascotaRepository.save(new Mascota("Tiger", "Bengala", 1, "NA", "Activo", "Imagenes/gato86.jpeg"));
        mascotaRepository.save(new Mascota("Mittens", "Maine Coon", 2, "NA", "Activo", "Imagenes/gato87.jpeg"));
        mascotaRepository.save(new Mascota("Chloe", "Exótico de Pelo Corto", 5, "NA", "Activo", "Imagenes/gato88.jpeg"));
        mascotaRepository.save(new Mascota("Nala", "Siberiano", 3, "NA", "Activo", "Imagenes/gato89.jpeg"));
        mascotaRepository.save(new Mascota("Finn", "Somalí", 2, "NA", "Activo", "Imagenes/gato90.jpeg"));
        mascotaRepository.save(new Mascota("Cleo", "Persa", 1, "NA", "Activo", "Imagenes/gato91.jpeg"));
        mascotaRepository.save(new Mascota("Salem", "Ragdoll", 4, "NA", "Activo", "Imagenes/gato92.jpeg"));
        mascotaRepository.save(new Mascota("Misty", "Azul Ruso", 2, "NA", "Activo", "Imagenes/gato93.jpeg"));
        mascotaRepository.save(new Mascota("Smokey", "Himalayo", 3, "NA", "Activo", "Imagenes/gato94.jpeg"));
        mascotaRepository.save(new Mascota("Midnight", "Devon Rex", 1, "NA", "Activo", "Imagenes/gato95.jpeg"));
        mascotaRepository.save(new Mascota("Cupcake", "Cornish Rex", 2, "NA", "Activo", "Imagenes/gato96.jpeg"));
        mascotaRepository.save(new Mascota("Whiskey", "Fold Escocés", 5, "NA", "Activo", "Imagenes/gato97.jpeg"));
        mascotaRepository.save(new Mascota("Misty", "Van Turco", 3, "NA", "Activo", "Imagenes/gato98.jpeg"));
        mascotaRepository.save(new Mascota("Angel", "Ragamuffin", 2, "NA", "Activo", "Imagenes/gato99.jpeg"));
        mascotaRepository.save(new Mascota("Salem", "Sphynx", 1, "NA", "Activo", "Imagenes/gato100.jpeg"));


        //crear asociaciones
        Cliente cliente = clienteRepository.findById(1L).get();

        //asignar mascotas a clientes
        for(Mascota mascota : mascotaRepository.findAll()){
            mascota.setCliente(cliente);
            mascotaRepository.save(mascota);    
        }
    }
    
}
