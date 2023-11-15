package proyecto.web.veterinaria.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;



@Configuration//Se crean beans
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private JwtAuthEntryPoint jwtAuthEntryPoint;
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .csrf(AbstractHttpConfigurer::disable)
                .headers(headers -> headers.frameOptions(frame -> frame.disable()))
                .sessionManagement(customizer -> customizer.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers("/h2/**").permitAll()
                        .requestMatchers("/clientes/all").hasAnyAuthority("VETERINARIO","ADMIN")
                        .requestMatchers("/veterinarios/all").hasAnyAuthority("ADMIN")
                        .requestMatchers("/mascotas/all").hasAnyAuthority("ADMIN","VETERINARIO")

                        .requestMatchers("clientes/agregar").hasAnyAuthority("VETERINARIO","ADMIN")
                        .requestMatchers("/veterinarios/agregar").hasAnyAuthority("ADMIN")
                        .requestMatchers("/mascotas/agregar").hasAnyAuthority("ADMIN","VETERINARIO")


                        .requestMatchers("clientes/delete//**").hasAnyAuthority("VETERINARIO","ADMIN")
                        .requestMatchers("veterinarios/delete/**").hasAnyAuthority("ADMIN")
                        .requestMatchers("/mascotas/delete/**").hasAnyAuthority("ADMIN","VETERINARIO")

                        .requestMatchers("clientes/update//**").hasAnyAuthority("VETERINARIO","ADMIN")
                        .requestMatchers("veterinarios/update/**").hasAnyAuthority("ADMIN")
                        .requestMatchers("/mascotas/update/**").hasAnyAuthority("ADMIN","VETERINARIO")

                        .requestMatchers("/clientes/find/**").hasAnyAuthority("CLIENTE","VETERINARIO","ADMIN")
                        .requestMatchers("/veterinarios/find/**").hasAnyAuthority("VETERINARIO","ADMIN")
                        .requestMatchers("/mascotas/find/**").hasAnyAuthority("ADMIN","VETERINARIO")

                        .requestMatchers("/veterinarios/details").hasAnyAuthority("VETERINARIO","ADMIN")
                        .requestMatchers("/clientes/details").hasAuthority("CLIENTE")
                        .anyRequest().permitAll()
                )
                .exceptionHandling( exception -> exception.authenticationEntryPoint(jwtAuthEntryPoint));

                http.addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public JWTAuthenticationFilter jwtAuthenticationFilter() {
        return new JWTAuthenticationFilter();
    }

    
}
