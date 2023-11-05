package proyecto.web.veterinaria.DTOs;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import proyecto.web.veterinaria.entity.Cliente;

@Mapper
public interface ClienteMapper {
    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    ClienteDTO convert (Cliente cliente);
    
}
