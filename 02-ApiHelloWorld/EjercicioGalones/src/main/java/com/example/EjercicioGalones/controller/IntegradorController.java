package com.example.EjercicioGalones.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegradorController {

    @GetMapping("convertir/{galones}")
    public String galonesALitros(
            @PathVariable double galones
    ) {
        // Convirtiendo galones a litros
        double litros = galones * 3.78541;
        return "La cantidad de litros equivalente a: " + galones + " galones " +
                "es de " + litros + " litros";
    }
}
