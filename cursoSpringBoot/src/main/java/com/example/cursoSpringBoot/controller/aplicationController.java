package com.example.cursoSpringBoot.controller;

import com.example.cursoSpringBoot.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class aplicationController {

    @PostMapping("/cliente")
    public void crearCliente(@RequestBody Cliente cli) {
        System.out.println("Cliente creado");
        System.out.println("Nombre: " + cli.getNombre());
        System.out.println("Apellido: " + cli.getApellido());
    }

    @GetMapping("/cliente/traer")
    @ResponseBody //Para regresar información en formato JSON. Podemos alterar que queremos que vaya en el cuerpo de
    // la respuesta
    public List<Cliente> traerClientes() {
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1L, "Zlatan", "Ibrahimovic"));
        listaClientes.add(new Cliente(2L, "Cristiano", "Ronaldo"));
        listaClientes.add(new Cliente(3L, "Leonel", "Messi"));

        return listaClientes;
    }


    @GetMapping("/pruebaresponse")
    // ResponseEntity permite manipular el cuerpo de la respuesta
    ResponseEntity<String> traerRespuesta(){
        return new ResponseEntity<>("Esta es una prueba de response", HttpStatus.NOT_FOUND);
    }


}
