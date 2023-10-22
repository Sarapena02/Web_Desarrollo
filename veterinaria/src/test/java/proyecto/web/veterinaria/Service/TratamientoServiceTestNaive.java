package proyecto.web.veterinaria.Service;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import java.util.List;

import proyecto.web.veterinaria.entity.Tratamiento;
import proyecto.web.veterinaria.service.TratamientoService;

@SpringBootTest
@DirtiesContext(classMode= DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@ActiveProfiles("test")
public class TratamientoServiceTestNaive {


    @Autowired
    private TratamientoService tratamientoService;

    @BeforeEach
    public void init(){
        Tratamiento tratamiento = new Tratamiento();
        Tratamiento tratamiento1 = new Tratamiento();


        tratamientoService.add(tratamiento);
        tratamientoService.add(tratamiento1);


    }

    @Test
    public void TratamientoService_createTratamiento_Tratamiento(){

        //Arrange
        Tratamiento tratamiento = new Tratamiento();
        Tratamiento tratamiento1 = new Tratamiento();

        //Act
        Tratamiento newTratamiento = tratamientoService.add(tratamiento);
        newTratamiento = tratamientoService.add(tratamiento1);

        //Assert
        Assertions.assertThat(newTratamiento).isNotNull();

    }

    public void TratamientoService_findAll_TratamientoList(){
        //Act
        List<Tratamiento> tratamientos = tratamientoService.findAll();

        //Assert
        Assertions.assertThat(tratamientos).isNotNull();
        Assertions.assertThat(tratamientos.size()).isEqualTo(2);
    }
    
    
}
