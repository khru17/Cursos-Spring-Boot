package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Endpoint con parametros
    @GetMapping("hello/{nombre}")
    public String sayHello(@PathVariable String nombre) {
        return "Hello World " +  nombre;
    }

    /*
        - @PathVariale
    // Endpoint con multiples parametros
    @GetMapping("hello/{nombre}/{edad}/{profesion}")
    public String sayHelloComplete(@PathVariable String nombre,
                                   @PathVariable int edad,
                                   @PathVariable String profesion) {
        return "Hello World. Tu nombre es " + nombre +
                " Edad: " + edad +
                " Profesión: " + profesion;
    }
    */

    //  - @RequestParam
    @GetMapping("hello")
    public String sayHelloComplete(@RequestParam String nombre,
                                   @RequestParam int edad,
                                   @RequestParam String profesion) {
        return "Hello World. Tu nombre es " + nombre +
                " Tu edad es: " + edad +
                " Tu profesión es: " + profesion;
    }



    @GetMapping("bye")
    public String sayBye() {
        return "Goodbye World";
    }



    /* EJERCICIOS */

    @GetMapping("suma/{num1}/{num2}")
    public String sum(
            @PathVariable double num1,
            @PathVariable double num2
    ) {
        double suma = num1 + num2;
        return "La suma de los números ingresados es: " + suma;
    }


    @GetMapping("imc")
    public String calcularSuma(@RequestParam double imc_persona) {

        String estado_peso = "";

        if(imc_persona <= 18.5) {
            estado_peso = "Peso insuficiente";
        } else if (imc_persona >= 18.6 && imc_persona <= 24.9) {
            estado_peso = "Peso saludable";
        } else if (imc_persona >=25.0 && imc_persona <= 29.9) {
            estado_peso = "Sobrepeso";
        } else if (imc_persona >= 30) {
            estado_peso = "Obesidad";
        }

        return "El estado de peso del paciente es: " + estado_peso;

    }

}
