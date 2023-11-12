package proyecto.web.veterinaria.DTOs;

import javax.annotation.processing.Generated;
import proyecto.web.veterinaria.entity.Veterinario;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-11T22:43:20-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
public class VeterinarioMapperImpl implements VeterinarioMapper {

    @Override
    public VeterinarioDTO convert(Veterinario veterinario) {
        if ( veterinario == null ) {
            return null;
        }

        VeterinarioDTO veterinarioDTO = new VeterinarioDTO();

        veterinarioDTO.setCedula( veterinario.getCedula() );
        veterinarioDTO.setEspecialidad( veterinario.getEspecialidad() );
        veterinarioDTO.setEstado( veterinario.getEstado() );
        veterinarioDTO.setFoto( veterinario.getFoto() );
        veterinarioDTO.setId( veterinario.getId() );
        veterinarioDTO.setNombre( veterinario.getNombre() );

        return veterinarioDTO;
    }
}
