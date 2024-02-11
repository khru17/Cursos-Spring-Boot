package com.cursospringboot.prueba.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Endpoint sayHello
    @GetMapping("/")
    public String sayHello() {
        return "Hola Mundo! Esto es una prueba";
    }

}
