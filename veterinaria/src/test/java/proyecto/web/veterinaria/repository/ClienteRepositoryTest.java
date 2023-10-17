package proyecto.web.veterinaria.repository;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Mascota;

@DataJpaTest
@RunWith(SpringRunner.class)
public class ClienteRepositoryTest {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private MascotaRepository mascotaRepository;

    // Caso inicial de creacion de entidades
    @BeforeEach
    void init() {
        clienteRepository.save(new Cliente("Juan", "1234567895", "juan@correo", "123456789"));
        clienteRepository.save(new Cliente("Juan Pérez", "123456789", "juan@correo1.com", "123456789"));
        clienteRepository.save(new Cliente("María García", "987654321", "maria@correo2.com", "987654321"));
        clienteRepository.save(new Cliente("Carlos López", "234567890", "carlos@correo3.com", "234567890"));
        clienteRepository.save(new Cliente("Lisa Rodríguez", "876543210", "laura@correo4.com", "876543210"));
        clienteRepository.save(new Cliente("Pedro Martínez", "345678901", "pedro@correo5.com", "345678901"));

        mascotaRepository.save(new Mascota("Jack", "Siamés", 2, "NA", "Activo",
                "https://blogger.googleusercontent.com/img/a/AVvXsEjkJLupeAFKtrO6_cQuZlns2Og3ur5WTFilP13nVwThhYDzja8Ek45mFAa5oUZwIw4kObxpDKFs_CiH6Ho6turTohDH7Fd7-iaKslaFK9zdXF-38v8KvqDX8DAzDF3FVzJY_U-ZeYBBM46osdrgG9Wm5r9y2dEJnxh4_NIzXWQF5yWnQqdwmhoZpcNF1qAN"));
        mascotaRepository.save(new Mascota("Sasha", "Criollo", 5, "NA", "Activo",
                "https://blogger.googleusercontent.com/img/a/AVvXsEgvSmCBsSlMDMRVX0FBoZEHUM4iS9ceeBp6ymPsKZHbfo-eTTcDL8_VTlb_etI0SjsF9RjzupZKslmfA4eDhjq3tfBvI20mBVakHKETtpyzdcV05-yMt7_WbQUyKEx9WDS5jwrDdKOdOTmxq45eoigII5MLt-VQ9Ycf69IO2UkGW3p6hdcSAyCvVEq6o0KJ"));
        mascotaRepository.save(new Mascota("Luna", "Persa", 2, "NA", "Inactivo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQbSqf5LDj1H5vzo8j7gd-Iw3Oc2Y8s2ZavlA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Max", "Maine Coon", 4, "NA", "Activo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNu8vbUF0Hy8wDDZ1keNcyGlILzaVabtuI9Q&usqp=CAU"));
        mascotaRepository.save(new Mascota("Oliver", "Bengala", 1, "NA", "Inactivo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHyswh9E28aNlky97G4SiOIf1-Wbl54VVl_A&usqp=CAU"));
        mascotaRepository.save(new Mascota("Milo", "Sphynx", 2, "NA", "Inactivo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMQN_qvH-nKWyHHc-D1a6JpVLRXxbfu_4yfA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Simba", "Ragdoll", 3, "NA", "Activo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThm7eIQFM-ZCoZBDA2LfLpo7mDi50GHRxg3Q&usqp=CAU"));
        mascotaRepository.save(new Mascota("Charlie", "Abisinio", 2, "NA", "Inactivo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcScAoBo0zZ8sQlVUB9dCxNr8Dl7Tvrbox0pPA&usqp=CAU"));
        mascotaRepository.save(new Mascota("Tiger", "Somalí", 5, "NA", "Activo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTt8pCcU438Qew8KnCmyWCzboxBbJVFEnCCbg&usqp=CAU"));

        Cliente cliente = clienteRepository.findById(1L).get();

        Mascota mascota1 = mascotaRepository.findById(1L).get();
        Mascota mascota2 = mascotaRepository.findById(2L).get();
        Mascota mascota3 = mascotaRepository.findById(3L).get();

        mascota1.setCliente(cliente);
        mascota2.setCliente(cliente);
        mascota3.setCliente(cliente);

        mascotaRepository.save(mascota1);
        mascotaRepository.save(mascota2);

    }

    // Prueba para la creacion de un cliente
    @Test
    public void clienteRepository_save_Cliente() {
        // arrange
        Cliente cliente = new Cliente("Juan", "1234567895", "juan@correo", "123456789");
        // act
        Cliente savedCliente = clienteRepository.save(cliente);

        // assert
        Assertions.assertThat(savedCliente).isNotNull();

    }

    @Test
    public void clienteRepository_FindAll_NotEmpyList() {

        // arrange

        // Se hace en el beforeEach

        // act

        List<Cliente> clientes = clienteRepository.findAll();

        // assert
        Assertions.assertThat(clientes).isNotNull();
        Assertions.assertThat(clientes.size()).isEqualTo(6);
        Assertions.assertThat(clientes.size()).isGreaterThan(0);
    }

    @Test
    public void clienteRepository_findById_FindWrongIndex() {
        // arrange
        Long index = -1l;

        // act
        Optional<Cliente> student = clienteRepository.findById(index);

        // assert
        Assertions.assertThat(student).isEmpty();
    }

    @Test
    public void clienteRepository_deleteById_EmptyStudent() {

        // arrange
        Long index = 2L;

        // act
        clienteRepository.deleteById(index);

        // assert
        Assertions.assertThat(clienteRepository.findById(index)).isEmpty();
    }

    @Test
    void StudentRepository_findByNombre_Student() {

        // arrange
        String cedula = "1234567895";

        // act
        Cliente cliente = clienteRepository.findByCedula(cedula);

        // assert
        Assertions.assertThat(cliente).isNotNull();
    }

    @Test
    void studentRepository_FindMasotasActivas_NotEmpyList() {

        // arrange

        // Se hace en el beforeEach

        // act
        List<Mascota> mascotas = clienteRepository.findMacotasActivas(1L);

        // assert
        Assertions.assertThat(mascotas).isNotNull();
        Assertions.assertThat(mascotas.size()).isEqualTo(2);
        Assertions.assertThat(mascotas.size()).isGreaterThan(0);
    }

    @Test
    void studentRepository_getMascotas_NotEmpyList() {

        // arrange

        // Se hace en el beforeEach

        // act

        List<Mascota> mascotas = clienteRepository.getMascotas(1L);

        // assert
        Assertions.assertThat(mascotas).isNotNull();
        Assertions.assertThat(mascotas.size()).isEqualTo(3);
        Assertions.assertThat(mascotas.size()).isGreaterThan(0);
    }

}
