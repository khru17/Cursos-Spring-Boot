package com.microservicios.pacientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PacientesApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "9001");
		SpringApplication.run(PacientesApplication.class, args);
	}

}
