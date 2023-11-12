package proyecto.web.veterinaria.DTOs;

import javax.annotation.processing.Generated;
import proyecto.web.veterinaria.entity.Tratamiento;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-11T22:43:20-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
public class TratamientoMapperImpl implements TratamientoMapper {

    @Override
    public TratamientoDTO convert(Tratamiento tratamiento) {
        if ( tratamiento == null ) {
            return null;
        }

        TratamientoDTO tratamientoDTO = new TratamientoDTO();

        tratamientoDTO.setDroga( tratamiento.getDroga() );
        tratamientoDTO.setFecha( tratamiento.getFecha() );
        tratamientoDTO.setId( tratamiento.getId() );
        tratamientoDTO.setMascota( tratamiento.getMascota() );
        tratamientoDTO.setVeterinario( tratamiento.getVeterinario() );

        return tratamientoDTO;
    }
}
