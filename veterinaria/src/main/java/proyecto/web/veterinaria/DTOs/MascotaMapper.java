package proyecto.web.veterinaria.DTOs;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import proyecto.web.veterinaria.entity.Mascota;

@Mapper
public interface MascotaMapper {
    MascotaMapper INSTANCE = Mappers.getMapper(MascotaMapper.class);

    MascotaDTO convert (Mascota mascota);
}
