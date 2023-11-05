package proyecto.web.veterinaria.DTOs;

import javax.annotation.processing.Generated;
import proyecto.web.veterinaria.entity.Cliente;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-05T16:13:19-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteDTO convert(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setCedula( cliente.getCedula() );
        clienteDTO.setCelular( cliente.getCelular() );
        clienteDTO.setCorreo( cliente.getCorreo() );
        clienteDTO.setNombre( cliente.getNombre() );

        return clienteDTO;
    }
}
