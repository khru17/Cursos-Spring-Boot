package com.pokeapi.MicroserviciosPokeApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
// Habilita clientes de feign
@EnableFeignClients
public class MicroserviciosPokeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosPokeApiApplication.class, args);
	}

}
