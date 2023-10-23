package proyecto.web.veterinaria.Service;


import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.springframework.test.context.ActiveProfiles;

import proyecto.web.veterinaria.entity.Tratamiento;
import proyecto.web.veterinaria.repository.TratamientoRepository;
import proyecto.web.veterinaria.service.TratamientoServiceImpl;

@ActiveProfiles("test")
@ExtendWith(MockitoExtension.class)
public class TratamientoServiceTestMock {

    @Mock
    TratamientoRepository tratamientoRepository;

    @InjectMocks
    private TratamientoServiceImpl tratamientoService;


    @Test
    public void  TratamientoService_createService_Tratamiento(){
        
        //arrange
         Tratamiento tratamiento1 = new Tratamiento( LocalDate.of(2023, 10, 1));
        
        when(tratamientoRepository.save(tratamiento1)).thenReturn(
            tratamiento1
        );

        //act
        Tratamiento newTratamiento = tratamientoService.add(tratamiento1);

        //assert
        Assertions.assertThat(newTratamiento).isNotNull();
    }

    @Test
    public void  TratamientoService_findAll_TratamientoList(){
        //arrange
        when(tratamientoRepository.findAll()).thenReturn(
            List.of(
                 new Tratamiento( LocalDate.of(2023, 10, 1)),
                 new Tratamiento( LocalDate.of(2023, 9, 15)),
                 new Tratamiento( LocalDate.of(2023, 10, 5)),
                 new Tratamiento( LocalDate.of(2023, 10, 10)),
                 new Tratamiento( LocalDate.of(2023, 9, 15))
            )
        );

        //act
        List<Tratamiento> tratamientos = tratamientoService.findAll();

        //assert
        Assertions.assertThat(tratamientos).isNotNull();
        Assertions.assertThat(tratamientos.size()).isEqualTo(5);
    
    }

    @Test
    public void  TratamientoService_findById_Tratamiento(){
        //arrange
        when(tratamientoRepository.findById(1L)).thenReturn(
            Optional.of(
                new Tratamiento( LocalDate.of(2023, 10, 1))
            )
        );
        //act
        Tratamiento tratamiento = tratamientoService.SearchById(1L);

        //assert
        Assertions.assertThat(tratamiento).isNotNull();
    }
    
}
