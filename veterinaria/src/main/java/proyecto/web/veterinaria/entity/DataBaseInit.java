package proyecto.web.veterinaria.entity;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        clienteRepository.save(new Cliente("Ana", "123456789", "ana@correo", "123456789"));
        clienteRepository.save(new Cliente("Juan", "456789123", "juan@correo", "456789123"));
        clienteRepository.save(new Cliente("María", "789123456", "maria@correo", "789123456"));
        clienteRepository.save(new Cliente("Luis", "321654987", "luis@correo", "321654987"));
        clienteRepository.save(new Cliente("Sofía", "654987321", "sofia@correo", "654987321"));
        clienteRepository.save(new Cliente("Carlos", "987321654", "carlos@correo", "987321654"));
        clienteRepository.save(new Cliente("Laura", "654321987", "laura@correo", "654321987"));
        clienteRepository.save(new Cliente("Miguel", "321987654", "miguel@correo", "321987654"));
        clienteRepository.save(new Cliente("Lucía", "987654123", "lucia@correo", "987654123"));
        clienteRepository.save(new Cliente("Alejandro", "123987654", "alejandro@correo", "123987654"));
        clienteRepository.save(new Cliente("Isabella", "789654321", "isabella@correo", "789654321"));
        clienteRepository.save(new Cliente("Diego", "456321987", "diego@correo", "456321987"));
        clienteRepository.save(new Cliente("Valentina", "987123456", "valentina@correo", "987123456"));
        clienteRepository.save(new Cliente("Javier", "654123789", "javier@correo", "654123789"));
        clienteRepository.save(new Cliente("Paula", "789456123", "paula@correo", "789456123"));
        clienteRepository.save(new Cliente("Andrés", "321789654", "andres@correo", "321789654"));
        clienteRepository.save(new Cliente("Camila", "987456321", "camila@correo", "987456321"));
        clienteRepository.save(new Cliente("Jorge", "123654789", "jorge@correo", "123654789"));
        clienteRepository.save(new Cliente("Valeria", "456987321", "valeria@correo", "456987321"));
        clienteRepository.save(new Cliente("Francisco", "789321654", "francisco@correo", "789321654"));
        clienteRepository.save(new Cliente("Natalia", "654789123", "natalia@correo", "654789123"));
        clienteRepository.save(new Cliente("Gustavo", "321456987", "gustavo@correo", "321456987"));
        clienteRepository.save(new Cliente("Elena", "987789321", "elena@correo", "987789321"));
        clienteRepository.save(new Cliente("Felipe", "654987789", "felipe@correo", "654987789"));
        clienteRepository.save(new Cliente("Daniela", "789987654", "daniela@correo", "789987654"));
        clienteRepository.save(new Cliente("Ricardo", "321123987", "ricardo@correo", "321123987"));
        clienteRepository.save(new Cliente("Marcela", "987654987", "marcela@correo", "987654987"));
        clienteRepository.save(new Cliente("Santiago", "123789123", "santiago@correo", "123789123"));
        clienteRepository.save(new Cliente("Gabriela", "456123456", "gabriela@correo", "456123456"));
        clienteRepository.save(new Cliente("Roberto", "789456789", "roberto@correo", "789456789"));
        clienteRepository.save(new Cliente("Renata", "321987321", "renata@correo", "321987321"));
        clienteRepository.save(new Cliente("Manuel", "987654654", "manuel@correo", "987654654"));
        clienteRepository.save(new Cliente("Mariana", "123321123", "mariana@correo", "123321123"));
        clienteRepository.save(new Cliente("Raúl", "456456456", "raul@correo", "456456456"));
        clienteRepository.save(new Cliente("Cristina", "789789789", "cristina@correo", "789789789"));
        clienteRepository.save(new Cliente("Pedro", "987654321", "pedro@correo", "987654321"));
        clienteRepository.save(new Cliente("Ana", "123456789", "ana@correo", "123456789"));
        clienteRepository.save(new Cliente("Juan", "456789123", "juan@correo", "456789123"));
        clienteRepository.save(new Cliente("María", "789123456", "maria@correo", "789123456"));
        clienteRepository.save(new Cliente("Luis", "321654987", "luis@correo", "321654987"));
        clienteRepository.save(new Cliente("Sofía", "654987321", "sofia@correo", "654987321"));
        clienteRepository.save(new Cliente("Carlos", "987321654", "carlos@correo", "987321654"));
        clienteRepository.save(new Cliente("Laura", "654321987", "laura@correo", "654321987"));
        clienteRepository.save(new Cliente("Miguel", "321987654", "miguel@correo", "321987654"));
        clienteRepository.save(new Cliente("Lucía", "987654123", "lucia@correo", "987654123"));
        clienteRepository.save(new Cliente("Alejandro", "123987654", "alejandro@correo", "123987654"));
        clienteRepository.save(new Cliente("Isabella", "789654321", "isabella@correo", "789654321"));
        clienteRepository.save(new Cliente("Diego", "456321987", "diego@correo", "456321987"));
        clienteRepository.save(new Cliente("Valentina", "987123456", "valentina@correo", "987123456"));
        clienteRepository.save(new Cliente("Javier", "654123789", "javier@correo", "654123789"));
        clienteRepository.save(new Cliente("Paula", "789456123", "paula@correo", "789456123"));
        clienteRepository.save(new Cliente("Andrés", "321789654", "andres@correo", "321789654"));
        clienteRepository.save(new Cliente("Camila", "987456321", "camila@correo", "987456321"));
        clienteRepository.save(new Cliente("Jorge", "123654789", "jorge@correo", "123654789"));
        clienteRepository.save(new Cliente("Valeria", "456987321", "valeria@correo", "456987321"));
        clienteRepository.save(new Cliente("Francisco", "789321654", "francisco@correo", "789321654"));
        clienteRepository.save(new Cliente("Natalia", "654789123", "natalia@correo", "654789123"));
        clienteRepository.save(new Cliente("Gustavo", "321456987", "gustavo@correo", "321456987"));
        clienteRepository.save(new Cliente("Elena", "987789321", "elena@correo", "987789321"));
        clienteRepository.save(new Cliente("Felipe", "654987789", "felipe@correo", "654987789"));
        clienteRepository.save(new Cliente("Daniela", "789987654", "daniela@correo", "789987654"));
        clienteRepository.save(new Cliente("Ricardo", "321123987", "ricardo@correo", "321123987"));
        clienteRepository.save(new Cliente("Marcela", "987654987", "marcela@correo", "987654987"));
        clienteRepository.save(new Cliente("Santiago", "123789123", "santiago@correo", "123789123"));
        clienteRepository.save(new Cliente("Gabriela", "456123456", "gabriela@correo", "456123456"));
        clienteRepository.save(new Cliente("Roberto", "789456789", "roberto@correo", "789456789"));
        clienteRepository.save(new Cliente("Renata", "321987321", "renata@correo", "321987321"));
        clienteRepository.save(new Cliente("Manuel", "987654654", "manuel@correo", "987654654"));
        clienteRepository.save(new Cliente("Mariana", "123321123", "mariana@correo", "123321123"));
        clienteRepository.save(new Cliente("Raúl", "456456456", "raul@correo", "456456456"));
        clienteRepository.save(new Cliente("Cristina", "789789789", "cristina@correo.com", "789789789"));
        clienteRepository.save(new Cliente("Juan", "123456789", "juan@correo.com", "987654321"));
        clienteRepository.save(new Cliente("Ana", "456789123", "ana@correo.com", "654321987"));
        clienteRepository.save(new Cliente("Pedro", "987654321", "pedro@correo.com", "123456789"));
        clienteRepository.save(new Cliente("Maria", "321654987", "maria@correo.com", "321654987"));
        clienteRepository.save(new Cliente("Luis", "654789321", "luis@correo.com", "789321654"));
        clienteRepository.save(new Cliente("Laura", "789123654", "laura@correo.com", "456789123"));
        clienteRepository.save(new Cliente("Pablo", "456123789", "pablo@correo.com", "987123654"));
        clienteRepository.save(new Cliente("Sofia", "321789456", "sofia@correo.com", "654789123"));
        clienteRepository.save(new Cliente("Carlos", "987123456", "carlos@correo.com", "123789456"));
        clienteRepository.save(new Cliente("Lucia", "654987123", "lucia@correo.com", "321987456"));
        clienteRepository.save(new Cliente("Miguel", "789654321", "miguel@correo.com", "789654321"));
        clienteRepository.save(new Cliente("Elena", "456321987", "elena@correo.com", "456321987"));
        clienteRepository.save(new Cliente("Diego", "123789654", "diego@correo.com", "123789654"));
        clienteRepository.save(new Cliente("Valentina", "987456321", "valentina@correo.com", "987456321"));
        clienteRepository.save(new Cliente("Manuel", "321987654", "manuel@correo.com", "321987654"));
        clienteRepository.save(new Cliente("Luisa", "654123789", "luisa@correo.com", "654123789"));
        clienteRepository.save(new Cliente("Javier", "789321987", "javier@correo.com", "789321987"));
        clienteRepository.save(new Cliente("Isabella", "456789321", "isabella@correo.com", "456789321"));
        clienteRepository.save(new Cliente("Alberto", "123654789", "alberto@correo.com", "123654789"));
        clienteRepository.save(new Cliente("Carolina", "987321654", "carolina@correo.com", "987321654"));
        clienteRepository.save(new Cliente("Roberto", "654987321", "roberto@correo.com", "654987321"));
        clienteRepository.save(new Cliente("Fernanda", "789456123", "fernanda@correo.com", "789456123"));
        clienteRepository.save(new Cliente("Raul", "456123987", "raul@correo.com", "456123987"));
        clienteRepository.save(new Cliente("Natalia", "321789654", "natalia@correo.com", "321789654"));
        clienteRepository.save(new Cliente("Julio", "987654123", "julio@correo.com", "987654123"));
        clienteRepository.save(new Cliente("Diana", "654321789", "diana@correo.com", "654321789"));
        clienteRepository.save(new Cliente("Hector", "789123456", "hector@correo.com", "789123456"));
        clienteRepository.save(new Cliente("Gloria", "123456987", "gloria@correo.com", "123456987"));



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
        List<Cliente> clientes = clienteRepository.findAll(); //Guarda en una lista todos los clientes
        List<Mascota> mascotas = mascotaRepository.findAll(); //Guarda en una lista todlas las mascotas
        Random random = new Random(); //Creamos el random para que se elija un cliente aleatorio

        for (Mascota mascota : mascotas) {
            int randomIndex = random.nextInt(clientes.size()); // Elegir un cliente aleatorio dentro del arreglo de clientes
            Cliente clienteAsociado = clientes.get(randomIndex);
            mascota.setCliente(clienteAsociado); //Se le asigna la mascota al cliente
            mascotaRepository.save(mascota); //Lo guarda en la base de datos
        }










        }
    }
   