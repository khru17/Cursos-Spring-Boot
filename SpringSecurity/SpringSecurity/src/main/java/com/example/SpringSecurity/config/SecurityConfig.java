package com.example.SpringSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

// Clase de configuracion para Security
@Configuration
// Especifica que esta es una clase de configuración de Spring Security
@EnableWebSecurity
public class SecurityConfig {

    // Configuration One
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .cors(Customizer.withDefaults())
                .authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/v1/index2").permitAll()
                        .anyRequest().authenticated()
                ).formLogin(Customizer.withDefaults())
                // httpBasic: Podemos enviar las credenciales en el header de la aplicaicón
                //.httpBasic(Customizer.withDefaults())
                // Sin la anterior configuración, al hacer una peticion con postman, nos regresara el html del login
                .build();
    }

    // Configuration two
    /*
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(auth -> {
                    // Todos los endpoints que pueden ser consultados sin iniciar sesión
                    auth.requestMatchers("/v1/index2").permitAll();
                    // Todos los demás endpoints necesitaran iniciar sesión
                    auth.anyRequest().authenticated();
                })
                .formLogin(form -> {
                    // Esto se usa cuando se logean correctamente, envie a un endpoint especifico
                    form.successHandler(successHandler()); // URL  a donde se va a ir despues de iniciar sesion
                })
                // Configurando el comportamiento de las sesiones
                .sessionManagement(
                        (sesion) -> {
                            // ALWAYS: crea una sesion siempe y cuando no exista ninguna, si existe una la va a reutilizar
                            // IF_REQUIRED: crea una sesión solo si es necesario (Evalua si es necesario crearla)
                            // NEVER: No crea ninguna sesión, pero si existe una la va a reutilizar
                            // STATELESS: No crea y no trabaja con sesiones.
                            sesion.sessionCreationPolicy(SessionCreationPolicy.ALWAYS); // ALWAYS - IF_REQUIRED -  NEVER - STATELESS
                            // En el caso de que no crea una sesión
                            sesion.invalidSessionUrl("/login");
                            // maximumSessions(1): Establece el número máximo de sesiones que puede crear cada usuario
                            sesion.maximumSessions(1)
                                    // expiredUrl("/login"): Reedirigue al usuario a la URL que se establece cuando expira la sesion
                                    .expiredUrl("/login")
                                    // sessionRegestry: podemos definir un objeto que se encargara de administrar todos los
                                    // registros que estan en la sesión
                                    .sessionRegistry(sessionRegistry());


                            // Se usa para evitar atacas de sesion
                            // migrateSession()
                            // newSession()
                            // none
                            sesion.sessionFixation().migrateSession();
                        })
                // httpBasic: Podemos enviar las credenciales en el header de la aplicaicón
                .httpBasic(Customizer.withDefaults())
                .build();
    }
     */

    @Bean
    public SessionRegistry sessionRegistry() {
        // SessionRegistryImpl: nos ayuda a obtener los datos de la sesión
        return new SessionRegistryImpl();
    }

    public AuthenticationSuccessHandler successHandler() {
        // Retorna una lambda
        return ((request, response, authentication) -> {
            // Nos reedirecciona a un endpoint
            response.sendRedirect("/v1/session");
        });
    }
}


// csrf(): Cross-Site Request Forgery - Es una medida de seguridad que funcina cuando se trabaja con formularios
