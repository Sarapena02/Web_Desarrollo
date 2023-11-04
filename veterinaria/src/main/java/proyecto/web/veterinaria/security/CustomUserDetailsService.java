package proyecto.web.veterinaria.security;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import proyecto.web.veterinaria.entity.Cliente;
import proyecto.web.veterinaria.entity.Rol;
import proyecto.web.veterinaria.entity.UserEntity;
import proyecto.web.veterinaria.entity.Veterinario;
import proyecto.web.veterinaria.repository.RolRepository;
import proyecto.web.veterinaria.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolRepository rolRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;    

    //Mapear userEntity a UserDetails (user standart de srping decurity)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userDB = userRepository.findByUsername(username).orElseThrow(
            () -> new UsernameNotFoundException("User not found")
        );

        UserDetails userDetails = new User(
        userDB.getUsername(),
        userDB.getPassword(),
        mapRolesToAuthorities(userDB.getRoles()));

        return userDetails;
    }

    //Rol de nuestra DB a GrantedAuthority
    private Collection<GrantedAuthority> mapRolesToAuthorities(List<Rol> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
    }

    public UserEntity ClienteToUser(Cliente cliente) {
        UserEntity user = new UserEntity();
        user.setUsername(cliente.getCedula());
        user.setPassword(passwordEncoder.encode("123"));

        Rol roles = rolRepository.findByNombre("CLIENTE").get();
        user.setRoles(List.of(roles));
        return user; 
    }

    public UserEntity VeterinarioToUser(Veterinario veterinario) {
        UserEntity user = new UserEntity();
        user.setUsername(veterinario.getCedula());
        user.setPassword(passwordEncoder.encode(veterinario.getContrasenia()));

        Rol roles = rolRepository.findByNombre("VETERINARIO").get();
        user.setRoles(List.of(roles));
        return user; 
    }
    
}
