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


        //crear asociaciones
        Cliente cliente = clienteRepository.findById(1L).get();

        //asignar mascotas a clientes
        for(Mascota mascota : mascotaRepository.findAll()){
            mascota.setCliente(cliente);
            mascotaRepository.save(mascota);    
        }
    }
    
}
