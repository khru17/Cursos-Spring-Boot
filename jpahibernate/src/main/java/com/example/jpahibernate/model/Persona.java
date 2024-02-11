package com.example.jpahibernate.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private  String nombre;
    private  String apellido;
    private int edad;
    /*
    // Asociacion 1 a 1
    @OneToOne
    // @JoinColumn("Nombre de la columna de esta tabla", "el nombre de la columna de la otra tabla con la que se asocia")
    @JoinColumn(name =  "una_mascota_id_mascota", referencedColumnName = "id_mascota")
    private Mascota unaMascota;
    */

    // Asociacion 1 a n
    @OneToMany
    private List<Mascota> listaMascotas;

    public Persona() {

    }
    public Persona(Long id, String nombre, String apellido, int edad, List<Mascota> listaMascotas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.listaMascotas = listaMascotas;
    }
}
