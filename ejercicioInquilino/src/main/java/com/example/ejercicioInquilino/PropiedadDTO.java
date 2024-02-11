package com.example.ejercicioInquilino;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// PropiedadDTO es una combinacion de elementos de inquilino y propiedad
public class PropiedadDTO {

    private Long id_propiedad;
    private String tipo_propiedad;
    private String direccion;
    private Double valor_aquiler;
    private String nombre;
    private String apellido;

    public PropiedadDTO() {
    }

    public PropiedadDTO(Long id_propiedad, String tipo_propiedad, String direccion, Double valor_aquiler, String nombre, String apellido) {
        this.id_propiedad = id_propiedad;
        this.tipo_propiedad = tipo_propiedad;
        this.direccion = direccion;
        this.valor_aquiler = valor_aquiler;
        this.nombre = nombre;
        this.apellido = apellido;
    }



}
