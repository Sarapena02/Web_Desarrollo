package proyecto.web.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import proyecto.web.veterinaria.entity.Admin;
import proyecto.web.veterinaria.security.JWTGenerator;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JWTGenerator jwtGenerator;


    @PostMapping("/login")
    @Operation(summary = "Log in de admin")
    public ResponseEntity login(@RequestBody Admin admin) {
        /*//busca dentro de la base de datos el cliente que tenga la cedula
        Veterinario veterinario = veterinarioService.SearchByCedula(requestBody.getCedula());
  
        return veterinario;*/
         Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(admin.getCedula(), admin.getContrasenia()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtGenerator.generateToken(authentication);

        return new ResponseEntity<String>(token, HttpStatus.OK);
    }
    
}
