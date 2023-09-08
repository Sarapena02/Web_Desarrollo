package proyecto.web.veterinaria.entity;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import jakarta.transaction.Transactional;
import proyecto.web.veterinaria.repository.ClienteRepository;
import proyecto.web.veterinaria.repository.DrogaRepository;
import proyecto.web.veterinaria.repository.MascotaRepository;
import proyecto.web.veterinaria.repository.TratamientoRepository;
import proyecto.web.veterinaria.repository.VeterinarioRepository;

@Controller
@Transactional
public class DataBaseInit implements ApplicationRunner{

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    MascotaRepository mascotaRepository;

    @Autowired
    VeterinarioRepository veterinarioRepository;

    @Autowired
    DrogaRepository drogaRepository;

    @Autowired
    TratamientoRepository tratamientoRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //agregar clientes
        clienteRepository.save(new Cliente("Juan", "1234567895", "juan@correo", "123456789"));
        clienteRepository.save(new Cliente("Juan Pérez", "123456789", "juan@correo1.com", "123456789"));
        clienteRepository.save(new Cliente("María García", "987654321", "maria@correo2.com", "987654321"));
        clienteRepository.save(new Cliente("Carlos López", "234567890", "carlos@correo3.com", "234567890"));
        clienteRepository.save(new Cliente("Laura Rodríguez", "876543210", "laura@correo4.com", "876543210"));
        clienteRepository.save(new Cliente("Pedro Martínez", "345678901", "pedro@correo5.com", "345678901"));
        clienteRepository.save(new Cliente("Ana Sánchez", "765432109", "ana@correo6.com", "765432109"));
        clienteRepository.save(new Cliente("Luis González", "456789012", "luis@correo7.com", "456789012"));
        clienteRepository.save(new Cliente("Carmen López", "654321098", "carmen@correo8.com", "654321098"));
        clienteRepository.save(new Cliente("Sofía Pérez", "567890123", "sofia@correo9.com", "567890123"));
        clienteRepository.save(new Cliente("Andrés Rodríguez", "543210987", "andres@correo10.com", "543210987"));
        clienteRepository.save(new Cliente("Elena Martínez", "432109876", "elena@correo11.com", "432109876"));
        clienteRepository.save(new Cliente("Javier Sánchez", "321098765", "javier@correo12.com", "321098765"));
        clienteRepository.save(new Cliente("Isabel García", "210987654", "isabel@correo13.com", "210987654"));
        clienteRepository.save(new Cliente("Raul López", "109876543", "raul@correo14.com", "109876543"));
        clienteRepository.save(new Cliente("Silvia Pérez", "987654322", "silvia@correo15.com", "987654322"));
        clienteRepository.save(new Cliente("Diego Rodríguez", "234567891", "diego@correo16.com", "234567891"));
        clienteRepository.save(new Cliente("Eva Martínez", "876543211", "eva@correo17.com", "876543211"));
        clienteRepository.save(new Cliente("Pablo Sánchez", "345678902", "pablo@correo18.com", "345678902"));
        clienteRepository.save(new Cliente("Marta López", "765432110", "marta@correo19.com", "765432110"));
        clienteRepository.save(new Cliente("Raúl González", "456789013", "raul@correo20.com", "456789013"));
        clienteRepository.save(new Cliente("Ana María Pérez", "654321099", "anamaria@correo21.com", "654321099"));
        clienteRepository.save(new Cliente("Carlos Fernández", "567890124", "carlos@correo22.com", "567890124"));
        clienteRepository.save(new Cliente("Luisa Rodríguez", "543210988", "luisa@correo23.com", "543210988"));
        clienteRepository.save(new Cliente("José López", "432109877", "jose@correo24.com", "432109877"));
        clienteRepository.save(new Cliente("Rosa García", "321098766", "rosa@correo25.com", "321098766"));
        clienteRepository.save(new Cliente("Jorge Martínez", "210987655", "jorge@correo26.com", "210987655"));
        clienteRepository.save(new Cliente("María José Sánchez", "109876544", "mariajose@correo27.com", "109876544"));
        clienteRepository.save(new Cliente("Manuel Pérez", "987654323", "manuel@correo28.com", "987654323"));
        clienteRepository.save(new Cliente("Cristina Rodríguez", "234567892", "cristina@correo29.com", "234567892"));
        clienteRepository.save(new Cliente("Sergio López", "876543213", "sergio@correo30.com", "876543213"));
        clienteRepository.save(new Cliente("Beatriz Martínez", "345678903", "beatriz@correo31.com", "345678903"));
        clienteRepository.save(new Cliente("Antonio Sánchez", "765432111", "antonio@correo32.com", "765432111"));
        clienteRepository.save(new Cliente("Natalia Pérez", "456789014", "natalia@correo33.com", "456789014"));
        clienteRepository.save(new Cliente("Daniel García", "654321100", "daniel@correo34.com", "654321100"));
        clienteRepository.save(new Cliente("Lucía López", "567890125", "lucia@correo35.com", "567890125"));
        clienteRepository.save(new Cliente("Juan José Rodríguez", "543210990", "juanjose@correo36.com", "543210990"));
        clienteRepository.save(new Cliente("Mónica Martínez", "432109879", "monica@correo37.com", "432109879"));
        clienteRepository.save(new Cliente("Paco Sánchez", "321098768", "paco@correo38.com", "321098768"));
        clienteRepository.save(new Cliente("Teresa Pérez", "210987657", "teresa@correo39.com", "210987657"));
        clienteRepository.save(new Cliente("Roberto García", "109876546", "roberto@correo40.com", "109876546"));
        clienteRepository.save(new Cliente("Isabella López", "987654324", "isabella@correo41.com", "987654324"));
        clienteRepository.save(new Cliente("Manuela Rodríguez", "234567893", "manuela@correo42.com", "234567893"));
        clienteRepository.save(new Cliente("Alejandro Martínez", "876543214", "alejandro@correo43.com", "876543214"));
        clienteRepository.save(new Cliente("Patricia Sánchez", "345678905", "patricia@correo44.com", "345678905"));
        clienteRepository.save(new Cliente("Gabriel Pérez", "765432112", "gabriel@correo45.com", "765432112"));
        clienteRepository.save(new Cliente("Lucas García", "456789015", "lucas@correo46.com", "456789015"));
        clienteRepository.save(new Cliente("Elena López", "654321101", "elena@correo47.com", "654321101"));
        clienteRepository.save(new Cliente("Olivia Martínez", "567890126", "olivia@correo48.com", "567890126"));
        clienteRepository.save(new Cliente("Juan Carlos Rodríguez", "543210989", "juancarlos@correo49.com", "543210989"));
        clienteRepository.save(new Cliente("Sara Sánchez", "432109878", "sara@correo50.com", "432109878"));
        clienteRepository.save(new Cliente("Miguel Pérez", "321098767", "miguel@correo51.com", "321098767"));
        clienteRepository.save(new Cliente("Cecilia García", "210987656", "cecilia@correo52.com", "210987656"));
        clienteRepository.save(new Cliente("Pablo López", "109876545", "pablo@correo53.com", "109876545"));
        clienteRepository.save(new Cliente("Ximena Martínez", "987654325", "ximena@correo54.com", "987654325"));
        clienteRepository.save(new Cliente("Andrea Rodríguez", "234567894", "andrea@correo55.com", "234567894"));
        clienteRepository.save(new Cliente("Adrián Sánchez", "876543215", "adrian@correo56.com", "876543215"));
        clienteRepository.save(new Cliente("Valentina Pérez", "345678906", "valentina@correo57.com", "345678906"));
        clienteRepository.save(new Cliente("Hugo García", "765432113", "hugo@correo58.com", "765432113"));
        clienteRepository.save(new Cliente("Marina López", "456789016", "marina@correo59.com", "456789016"));
        clienteRepository.save(new Cliente("Gustavo Martínez", "654321102", "gustavo@correo60.com", "654321102"));
        clienteRepository.save(new Cliente("Rocío Rodríguez", "567890127", "rocio@correo61.com", "567890127"));
        clienteRepository.save(new Cliente("Francisco Sánchez", "543210991", "francisco@correo62.com", "543210991"));
        clienteRepository.save(new Cliente("Camila Pérez", "432109880", "camila@correo63.com", "432109880"));
        clienteRepository.save(new Cliente("Iván García", "321098769", "ivan@correo64.com", "321098769"));
        clienteRepository.save(new Cliente("Valeria López", "210987658", "valeria@correo65.com", "210987658"));
        clienteRepository.save(new Cliente("Eduardo Martínez", "109876547", "eduardo@correo66.com", "109876547"));
        clienteRepository.save(new Cliente("Natalie Rodríguez", "987654326", "natalie@correo67.com", "987654326"));
        clienteRepository.save(new Cliente("Arturo Sánchez", "234567895", "arturo@correo68.com", "234567895"));
        clienteRepository.save(new Cliente("Carolina Pérez", "876543216", "carolina@correo69.com", "876543216"));
        clienteRepository.save(new Cliente("Roberto López", "345678907", "roberto@correo70.com", "345678907"));
        clienteRepository.save(new Cliente("Sandra Martínez", "765432114", "sandra@correo71.com", "765432114"));
        clienteRepository.save(new Cliente("Martín García", "456789017", "martin@correo72.com", "456789017"));
        clienteRepository.save(new Cliente("Alicia Rodríguez", "654321103", "alicia@correo73.com", "654321103"));
        clienteRepository.save(new Cliente("Diego Sánchez", "567890128", "diego@correo74.com", "567890128"));
        clienteRepository.save(new Cliente("Lorena Pérez", "543210992", "lorena@correo75.com", "543210992"));
        clienteRepository.save(new Cliente("Fernando López", "432109881", "fernando@correo76.com", "432109881"));
        clienteRepository.save(new Cliente("Gabriela Martínez", "321098770", "gabriela@correo77.com", "321098770"));
        clienteRepository.save(new Cliente("Eduardo Rodríguez", "210987659", "eduardo@correo78.com", "210987659"));
        clienteRepository.save(new Cliente("Isidro Sánchez", "109876548", "isidro@correo79.com", "109876548"));
        clienteRepository.save(new Cliente("Paola Pérez", "987654327", "paola@correo80.com", "987654327"));
        clienteRepository.save(new Cliente("Luciano García", "234567896", "luciano@correo81.com", "234567896"));
        clienteRepository.save(new Cliente("Luz López", "876543217", "luz@correo82.com", "876543217"));
        clienteRepository.save(new Cliente("Antonia Martínez", "345678908", "antonia@correo83.com", "345678908"));
        clienteRepository.save(new Cliente("Ricardo Rodríguez", "765432115", "ricardo@correo84.com", "765432115"));
        clienteRepository.save(new Cliente("Mariana Sánchez", "456789018", "mariana@correo85.com", "456789018"));
        clienteRepository.save(new Cliente("Joaquín Pérez", "654321104", "joaquin@correo86.com", "654321104"));
        clienteRepository.save(new Cliente("Laura García", "567890129", "laura@correo87.com", "567890129"));
        clienteRepository.save(new Cliente("Fernanda López", "543210993", "fernanda@correo88.com", "543210993"));
        clienteRepository.save(new Cliente("Héctor Martínez", "432109882", "hector@correo89.com", "432109882"));
        clienteRepository.save(new Cliente("Valentín Sánchez", "321098771", "valentin@correo90.com", "321098771"));
        clienteRepository.save(new Cliente("Rosa Rodríguez", "210987660", "rosa@correo91.com", "210987660"));
        clienteRepository.save(new Cliente("Julián Pérez", "109876549", "julian@correo92.com", "109876549"));
        clienteRepository.save(new Cliente("Aurora García", "987654328", "aurora@correo93.com", "987654328"));
        clienteRepository.save(new Cliente("Germán López", "234567897", "german@correo94.com", "234567897"));
        clienteRepository.save(new Cliente("Carla Martínez", "876543218", "carla@correo95.com", "876543218"));
        clienteRepository.save(new Cliente("Raul Sánchez", "345678909", "raul@correo96.com", "345678909"));
        clienteRepository.save(new Cliente("Victoria Pérez", "765432116", "victoria@correo97.com", "765432116"));
        clienteRepository.save(new Cliente("Renato Rodríguez", "456789019", "renato@correo98.com", "456789019"));
        clienteRepository.save(new Cliente("Claudia López", "654321105", "claudia@correo99.com", "654321105"));
        clienteRepository.save(new Cliente("Gonzalo Martínez", "567890130", "gonzalo@correo100.com", "567890130"));




        //agregar mascotas
        mascotaRepository.save(new Mascota("Jack", "Siamés", 2, "NA", "Activo", "https://blogger.googleusercontent.com/img/a/AVvXsEjkJLupeAFKtrO6_cQuZlns2Og3ur5WTFilP13nVwThhYDzja8Ek45mFAa5oUZwIw4kObxpDKFs_CiH6Ho6turTohDH7Fd7-iaKslaFK9zdXF-38v8KvqDX8DAzDF3FVzJY_U-ZeYBBM46osdrgG9Wm5r9y2dEJnxh4_NIzXWQF5yWnQqdwmhoZpcNF1qAN"));
        mascotaRepository.save(new Mascota("Sasha", "Criollo", 5, "NA", "Activo", "https://blogger.googleusercontent.com/img/a/AVvXsEgvSmCBsSlMDMRVX0FBoZEHUM4iS9ceeBp6ymPsKZHbfo-eTTcDL8_VTlb_etI0SjsF9RjzupZKslmfA4eDhjq3tfBvI20mBVakHKETtpyzdcV05-yMt7_WbQUyKEx9WDS5jwrDdKOdOTmxq45eoigII5MLt-VQ9Ycf69IO2UkGW3p6hdcSAyCvVEq6o0KJ"));
        mascotaRepository.save(new Mascota("Luna", "Persa", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQbSqf5LDj1H5vzo8j7gd-Iw3Oc2Y8s2ZavlA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Max", "Maine Coon", 4, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNu8vbUF0Hy8wDDZ1keNcyGlILzaVabtuI9Q&usqp=CAU"));
        mascotaRepository.save(new Mascota("Oliver", "Bengala", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHyswh9E28aNlky97G4SiOIf1-Wbl54VVl_A&usqp=CAU"));
        mascotaRepository.save(new Mascota("Milo", "Sphynx", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMQN_qvH-nKWyHHc-D1a6JpVLRXxbfu_4yfA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Simba", "Ragdoll", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThm7eIQFM-ZCoZBDA2LfLpo7mDi50GHRxg3Q&usqp=CAU"));
        mascotaRepository.save(new Mascota("Charlie", "Abisinio", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcScAoBo0zZ8sQlVUB9dCxNr8Dl7Tvrbox0pPA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Tiger", "Somalí", 5, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTt8pCcU438Qew8KnCmyWCzboxBbJVFEnCCbg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Leo", "Oriental de Pelo Corto", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuoGMvz1nIoZ5aBAEiUZqMKP8KXhTSTIPSTw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Oscar", "Siberiano", 4, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsUMZHTtsdUZGQREg0EG9Ba3Rz1t8dmMpqag&usqp=CAU"));
        mascotaRepository.save(new Mascota("Mia", "Siamés Moderno", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEYjCU5W9Q44fB-0MM9cyup9z6x38eWYTd0A&usqp=CAU"));
        mascotaRepository.save(new Mascota("Jasper", "Azul Ruso", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHfvPBHrZcMZwmlIP_zI6AgsnAuOJRzmOAjw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Chloe", "Exótico de Pelo Corto", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZ4WqbrcmTl_Gr5rd-14KkBZOTAKWsVQtF_OPLMezoximcmmFFheb2R6_50U4ZZT9lbQY&usqp=CAU"));
        mascotaRepository.save(new Mascota("Nala", "Birmano", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRE4J9xEG8mo9cOkIdj-m1waxm9-cbAW0bH7A&usqp=CAU"));
        mascotaRepository.save(new Mascota("Mochi", "Fold Escocés", 4, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhqJ4bsa6XPUbqHoOVgnJ9tIQR-uDjUbL1Xw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Finn", "Británico de Pelo Corto", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1iKeYv2nA453UoI43HyCy1AYBuxevAJQWAw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Cleo", "Cornish Rex", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1kMEkp3nPNeWTL-Fk6YxxjjxrOLqyYoaCbg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Loki", "Devon Rex", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNnZEPbAiFmSyre6vc9dSRf8XorbiDWgnqkw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Zoe", "Himalayo", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcaIdPOOHcz3yFoUobbdQS_d2hfHOmxUDAzg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Misty", "Fold Escocés", 5, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn2RH1U-UQDSeK3WIDj6WSwd7y4KTgD8NYbw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Pepino", "Sphynx", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTk1oZIyCh72cuEoKQDOzt9QveYyMu4BFAvwg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Mittens", "Van Turco", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQiX1vtERPawO0UAG1EYwsZoA62-zrNVsPOjjFeDhi9MtZt1acH1NGYWPiQkKq67vY2Hh0&usqp=CAU"));
        mascotaRepository.save(new Mascota("Muffin", "Ragamuffin", 4, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRlPIhqYuFOf2814YkcgtJoMR5cunZ996yFnQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Snowball", "Bosque de Noruega", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRa9fZzTLgLJcgPJi0mHQo4Sz1lzckHZU-p3Q&usqp=CAU"));
        mascotaRepository.save(new Mascota("Whiskers", "Highland Fold", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwBGAIjs1ImmS1NXJkZaKQeWWBUbRsyuJwvw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Tinkerbell", "Siamés Moderno", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS83WVpxfEG6X-FvYHFLHukoxaWQ1aCZEVALw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Midnight", "Bombay", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnTfygpilD7hADTsTb5Vgi-1K_GqB38IExLQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Cupcake", "Fold Escocés", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7M8g7_SX0Q-1HGmFAeEc5EOfwhSmb4pP49Q&usqp=CAU"));
        mascotaRepository.save(new Mascota("Whiskey", "Siberiano", 4, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQO4sPlQqBNS3x5pvRTaJ1N5ASVvHpP9DzFXAcg_2Y00dDYY7rXxyDMy1FBCmBBs7LB0Rs&usqp=CAU"));
        mascotaRepository.save(new Mascota("Misty", "Somalí", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdMX6HShggCvtPPSeswI2rF3xHIk1lseAGwpdbkVA3_UOnJY5Zze4JUDKxuI3bAKMewuI&usqp=CAU"));
        mascotaRepository.save(new Mascota("Angel", "Angora Turco", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQH7zoJrmPrMZzxOoGVTVo2Fa_I6sooqj4bgA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Smokey", "Ragdoll", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRr2gS3qwvQ_cdyDt_YG0v76JPRxolbzoO8Ig&usqp=CAU"));
        mascotaRepository.save(new Mascota("Pumpkin", "Abisinio", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQy2fll6tqebzCjYhGW4BQ9cHNdJN-N9vOjSQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Ginger", "Persa", 5, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQvAUYSrY_HrpzsV7Bjw_P4hDKOuxinyFKKg5c1Ifbbb0eLkh6bO2yvPXd5acKZvA_owG4&usqp=CAU"));
        mascotaRepository.save(new Mascota("Harley", "Maine Coon", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFW3r3VDZdO5qi_XsqLttEs1Kt7GGQevpmBA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Snickers", "Azul Ruso", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSIcvcKG1awo5E6TtZjZXiDu0uo9sA_OR7JNA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Shadow", "Exótico de Pelo Corto", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShXbNzNCsGgOon2EJ5eHcWIkGMKyah2IqKsw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Coco", "Ragamuffin", 4, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSe8C2nRo3i13-CpMy-h2OelRWC1EF1qlh4fg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Rocky", "Fold Escocés", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7esj5-sU18O2sxXuo444LafZWqXPs0MdPgw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Salem", "Himalayo", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJ7jU_25-zWT7DfkHgotRY0Nt_I_b-L-9vYQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Simba", "Devon Rex", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGTlasxcvKyshO7CzkgOHrKV2VZ8_Xy19Ez5FMl_XRF6ORtKtvuLYGrhqllediRIb6MXc&usqp=CAU"));
        mascotaRepository.save(new Mascota("Lily", "Cornish Rex", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDyf0zRatbLXHzg3zD9W8wFNjhDsVxkaDfGw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Ruby", "Sphynx", 5, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkKOcDZ5QO-pMEzJjcZD-Go8P6wfESux1AAg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Mochi", "Ragdoll", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZiRcjPwOc47EVADVY4bhgYF8qU67BqXcDSA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Charlie", "Fold Escocés", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSzaZBx0NZRCt0pYIJUYd6M-qn-2mauR_zjA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Tiger", "Van Turco", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTxctymaoaHkYRJ0axLWX6GbaGvcq2RKfw7Q&usqp=CAU"));
        mascotaRepository.save(new Mascota("Mittens", "Birmano", 4, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1mdMFHRApxb4xEzeUDV0lY6xYFlox70RDDQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Chloe", "Siamés Moderno", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUdCKhXoUedwuBNWejq5cjqCJ344Ld7baGmw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Nala", "Siberiano", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLtI6TN5NwRYIvN0RZkO-mYKK_OsGinFzoew&usqp=CAU"));
        mascotaRepository.save(new Mascota("Finn", "Somalí", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZtR1gBOpd_CsLr1WQ5Zq2ij87bgbATg3L8A&usqp=CAU"));
        mascotaRepository.save(new Mascota("Cleo", "Persa", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQl-NRo3izKKSiOL_IYb0Zu5T9Sy_DwkUu6UU9KkjxzR61D0o9diJdZzj5bnQiCYX3CNfI&usqp=CAU"));
        mascotaRepository.save(new Mascota("Salem", "Maine Coon", 5, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRKgNZ71nLv20Z5kshHmnTWkEjqb7xBeh4EGw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Misty", "Angora Turco", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQbV4Tvcw0PIJDykQzv7liuwQgqX3EXI9bPFg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Smokey", "Ragamuffin", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRu7nenXJtUOKQikB90btF3XAEmMJqQFIjfQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Midnight", "Oriental de Pelo Corto", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNXN_FuC9_cyDklSyYWRVGCF3u9exxKIwZSQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Cupcake", "Bengala", 4, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkWG4fS6icQm6yAD1UmpWxqOJjzH4pR8AxOA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Whiskey", "Sphynx", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToaE5RRGgO4deaEsSgpMUVk8_YBCyDndPGYj8XhUbfvllDH-6EbyJOm0t8JT_tLQutK9Y&usqp=CAU"));
        mascotaRepository.save(new Mascota("Misty", "Azul Ruso", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSe8C2nRo3i13-CpMy-h2OelRWC1EF1qlh4fg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Angel", "Exótico de Pelo Corto", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZiRcjPwOc47EVADVY4bhgYF8qU67BqXcDSA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Salem", "Birmano", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQR7L_G-L_BEMRpuPD9y6s65vBxKMxVZU-IJw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Simba", "Ragdoll", 5, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdej-LybMJhhJaLX7ykMqFyP-_9ZaXRm430g&usqp=CAU"));
        mascotaRepository.save(new Mascota("Lily", "Abisinio", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzvWN4mKvGWWBh69Rvp4t5J9YGO7-xZV2p6A&usqp=CAU"));
        mascotaRepository.save(new Mascota("Ruby", "Devon Rex", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRR0MlHU9-HXqgu7x6Jui8h_wH_Q6z8zpiMqQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Mochi", "Himalayo", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGyo-kLGbe4BzYGNjSGZC5xOJ3pc66uXKoyw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Charlie", "Cornish Rex", 4, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuQPqJP8-ASQKg03BbatTh7vBpG3gdQI-LCg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Tiger", "Sphynx", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSaCDV4NwYciLIlZz9z82ne0KxvDD9ddS5vAQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Mittens", "Fold Escocés", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUOEjFhUsMi0SHXiGgzbtKPSBxqs6hxTxyAA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Chloe", "Van Turco", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBbpaR2AmGPmsSpo0bK7CAbxa48oco-OK_Rg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Nala", "Ragamuffin", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzyZqoa5qG949PBUWZbFoqtojk3KqujzAAxQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Finn", "Somalí", 5, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSKkK9WGjHzuz9McatoZ4_VCnBaX8CJLojkw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Cleo", "Persa", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQbQsITyf8mi3vxjVgqTAJ2RW9p9VuIJJMXdA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Salem", "Maine Coon", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5cZBWeiyiqXmawzHy4BlAZlWYD0WvSqvbrg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Misty", "Bengala", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSM6jQliqJa9P35x1dlz4gx4bxgcn7o8rRUzw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Smokey", "Sphynx", 4, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRByHVbGp_ZoixZMxRnfiZLw1scHuc30J4x2Q&usqp=CAU"));
        mascotaRepository.save(new Mascota("Midnight", "Exótico de Pelo Corto", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvCrKPAxLoFyX9haqzmKqHYMZqGlnUqXEqZw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Cupcake", "Siberiano", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVsZOAHjBgYuGRaDkUZBVMaI7iprWJIWDV1g&usqp=CAU"));
        mascotaRepository.save(new Mascota("Whiskey", "Ragdoll", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSIKHiHZ7lPeUi2QJo0gbpPN1H8OkEHV23SNg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Misty", "Abisinio", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSIGx9OwntJ3zex6akdmyd8J-vuITLLj__IPCe_B8sCbmHgveHl4rQflQmyfsosuEYVsJI&usqp=CAU"));
        mascotaRepository.save(new Mascota("Angel", "Devon Rex", 5, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcg83MX0sbNSF57oUPf6MVyGAnfHYBfk-pm2DksH2uCB6QBIWN-xPUz9Sal-TU7RbXMyw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Salem", "Himalayo", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpXTAJvHorJsMjQ1mHdp5AU3Zuv9dT0b9fYg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Simba", "Cornish Rex", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBubY11_mWumOHAUOmiDj_76MmzGAeNWXMGQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Lily", "Fold Escocés", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6wT4GA_xZl0FDYU88UZ9Ei02RYXX4eF66Lw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Ruby", "Van Turco", 4, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJVwd-fdh8iMmNYSJjPw2yQj1gckmtYAINVw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Mochi", "Ragamuffin", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLiHJ75wlyfClPezr5wvoqwIewAqGm-UJFgA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Charlie", "Sphynx", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsiS3N62wS8sgPFH7jPHH-iROQl5N6YuV8MQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Tiger", "Bengala", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQY7wO4wJLOkyEl-bzFrBwVcGufmFb83hPB9Or6_ldb0iN8X1UcNhfEHIfRJ2TXEhWoNoM&usqp=CAU"));
        mascotaRepository.save(new Mascota("Mittens", "Maine Coon", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnhmHDv7aTh-qT8IyO1UcjXchTDLpxG5DsRA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Chloe", "Exótico de Pelo Corto", 5, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAiLysfKynr3MoTJpFpY-_Fs_58U5BkzhLmQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Nala", "Siberiano", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKIyM0CY1Ci7xScOIjp4WvoDHfCGFqdpiZ3w&usqp=CAU"));
        mascotaRepository.save(new Mascota("Finn", "Somalí", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSMXcRBUeqUgL1hah28oeOI7kCbYaVSyyyxjw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Cleo", "Persa", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3L9ZgUy89YMOrFdqeRvMyzJUrgi2kdIxVGA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Salem", "Ragdoll", 4, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNvKvRXPc7h7_4hlNuSY3vsKe3hFH4gTJ5KKbxQfGMTxKdp0TVoJwpRo5x-3f8RV2hXBw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Misty", "Azul Ruso", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKskU7vTLR8NYE9HCw5CMaP1mESKWpWWaslg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Smokey", "Himalayo", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtxjILg6yZi7kLvQ3S164BDhcDyaF-H1ByVg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Midnight", "Devon Rex", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQVYt1z3BSDjxkoHA_x88S1Yss4xrIRgAWQ9w&usqp=CAU"));
        mascotaRepository.save(new Mascota("Cupcake", "Cornish Rex", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShl2B3qudrTfV6hGkTGucjRrB-JpFM5ktnOQ&usqp=CAU"));
        mascotaRepository.save(new Mascota("Whiskey", "Fold Escocés", 5, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWqGtg9hfTRaFMYnOdPc1zenAfxF15m-Wzxw&usqp=CAU"));
        mascotaRepository.save(new Mascota("Misty", "Van Turco", 3, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUDa4EZyFCPfLzISMKQEODWlvxqGRUSdhaxg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Angel", "Ragamuffin", 2, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS04FazkkzwCEJA4YTvUEp-D4Sa1whhQidRTg&usqp=CAU"));
        mascotaRepository.save(new Mascota("Salem", "Sphynx", 1, "NA", "Activo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ69f1xHz-gJbNzikzaWgs6YypjzaHaEGXAKg&usqp=CAU"));

        //Agregar veterinarios
        veterinarioRepository.save(new Veterinario("Walter", "12345678910", "walter1", "Cirugia","https://media.licdn.com/dms/image/D4E03AQFJw7XUiXz6Yg/profile-displayphoto-shrink_800_800/0/1667784141711?e=2147483647&v=beta&t=TY52duHebBPoWB2uxWMWjvm7NO1XBszLRtYTm7VzwkY"));

        //Agregar drogas
        drogaRepository.save(new Droga("Paracetamol",100L));

        //Agregar tratamientos
        tratamientoRepository.save(new Tratamiento( LocalDate.now()));

        //crear asociaciones
        List<Cliente> clientes = clienteRepository.findAll(); //Guarda en una lista todos los clientes
        List<Mascota> mascotas = mascotaRepository.findAll(); //Guarda en una lista todlas las mascotas

        for (int i = 0; i < mascotas.size(); i++) {
            // Asegúrate de que i no sea mayor que la cantidad de clientes disponibles
            int clienteIndex = i % clientes.size(); // Calcula el índice del cliente correspondiente
            Cliente clienteAsociado = clientes.get(clienteIndex);
            
            // Obtén la mascota actual
            Mascota mascota = mascotas.get(i);
            
            // Asigna el cliente al que corresponde
            mascota.setCliente(clienteAsociado);
            
            // Guarda la mascota en la base de datos
            mascotaRepository.save(mascota);
        }

        Mascota mascotaTra = mascotaRepository.findById(1L).get();
        Veterinario veterinarioTra = veterinarioRepository.findById(1L).get();
        Droga drogaTra = drogaRepository.findById(1L).get();
        Tratamiento tratamientoTra = tratamientoRepository.findById(1L).get();

        tratamientoTra.setMascota(mascotaTra);
        tratamientoTra.setVeterinario(veterinarioTra);
        tratamientoTra.setDroga(drogaTra);

        tratamientoRepository.save(tratamientoTra);


        }
    }
   