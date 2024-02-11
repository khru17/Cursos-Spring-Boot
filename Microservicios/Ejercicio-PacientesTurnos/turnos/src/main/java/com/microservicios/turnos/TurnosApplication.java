package com.microservicios.turnos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TurnosApplication {

	public static void main(String[] args) {
		// System.setProperty("server.port", "9002");
		SpringApplication.run(TurnosApplication.class, args);
	}

}
