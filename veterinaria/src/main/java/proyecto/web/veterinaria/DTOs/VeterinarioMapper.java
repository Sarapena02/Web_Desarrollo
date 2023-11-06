package proyecto.web.veterinaria.DTOs;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import proyecto.web.veterinaria.entity.Veterinario;

@Mapper
public interface VeterinarioMapper {

    VeterinarioMapper INSTANCE = Mappers.getMapper(VeterinarioMapper.class);
    VeterinarioDTO convert(Veterinario veterinario);
}
