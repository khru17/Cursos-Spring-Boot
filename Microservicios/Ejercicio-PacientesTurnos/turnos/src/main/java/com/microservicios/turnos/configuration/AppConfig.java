package com.microservicios.turnos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration // Nos permite establecer que esta clase es de configuración
public class AppConfig {

    // Bean: Nos permite guardar el objeto que se crearrde en este metodo bajo un alias
    @Bean("apiConsumir")
    public RestTemplate registrarRestTemplate() {
        return new RestTemplate();
    }

}
