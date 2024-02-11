package com.example.ejercicioInquilino.controller;

import com.example.ejercicioInquilino.Inquilino;
import com.example.ejercicioInquilino.Propiedad;
import com.example.ejercicioInquilino.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicationController {
    // Simulando que obtenemos un id
    @GetMapping("/propiedad/{id}")
    @ResponseBody // Para regresar una respuesta de tipo PropiedadDTO
    public PropiedadDTO devolverPropiedad(@PathVariable Long id) {
        // Buscamos a traves de la id la propiedad
        // Traemos al inquilino asociado

        Propiedad prop = new Propiedad(
                1548L,
                "Casa",
                "308 Negro Arroyo Lane",
                200.0,
                40000.0);

        Inquilino inqui = new Inquilino(1L,
                "12345678",
                "Walter",
                "Whide",
                "Profesor de quimixa");


        // Creando la propiedadDTO (creando una instancia de propiedadDTO)
        PropiedadDTO propiDTO = new PropiedadDTO();
        // Asignamos los datos que necesitamos de propiedad
        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo_propiedad(prop.getTipo_propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValor_aquiler(prop.getValor_aquiler());
        // Asignamos los datos de inquilino que necesitamos
        propiDTO.setNombre(inqui.getNombre());
        propiDTO.setApellido(inqui.getApellido());


        // retornando la propiedadDTO
        return propiDTO;


    }

}
