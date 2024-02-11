package com.example.cursoSpringBoot;

import lombok.Getter;
import lombok.Setter;


// Establecer los getters y setters de las propiedades de la clase
@Getter @Setter
public class Cliente {

    private Long id;
    private String nombre;
    private  String apellido;


    public Cliente(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

}
