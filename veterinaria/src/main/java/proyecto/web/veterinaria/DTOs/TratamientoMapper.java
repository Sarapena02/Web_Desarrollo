package proyecto.web.veterinaria.DTOs;

import org.mapstruct.factory.Mappers;

import proyecto.web.veterinaria.entity.Tratamiento;

public interface TratamientoMapper {
    TratamientoMapper INSTANCE = Mappers.getMapper(TratamientoMapper.class);

    TratamientoDTO convert (Tratamiento tratamiento);
    
}
