package com.example.arquitecturamulticapas.model;

import lombok.Getter;
import lombok.Setter;

import java.security.PrivateKey;

@Getter @Setter
public class Persona {

    private Long id;
    private String nombre;
    private String apellido;

    public Persona() {

    }

    public Persona(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
