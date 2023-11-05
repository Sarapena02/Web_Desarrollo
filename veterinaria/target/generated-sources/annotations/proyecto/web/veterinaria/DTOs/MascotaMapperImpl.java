package proyecto.web.veterinaria.DTOs;

import javax.annotation.processing.Generated;
import proyecto.web.veterinaria.entity.Mascota;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-04T20:17:44-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
public class MascotaMapperImpl implements MascotaMapper {

    @Override
    public MascotaDTO convert(Mascota mascota) {
        if ( mascota == null ) {
            return null;
        }

        MascotaDTO mascotaDTO = new MascotaDTO();

        mascotaDTO.setEdad( mascota.getEdad() );
        mascotaDTO.setEnfermedad( mascota.getEnfermedad() );
        mascotaDTO.setEstado( mascota.getEstado() );
        mascotaDTO.setRaza( mascota.getRaza() );

        return mascotaDTO;
    }
}
