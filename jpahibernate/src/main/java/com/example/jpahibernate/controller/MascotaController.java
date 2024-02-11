package com.example.jpahibernate.controller;

import com.example.jpahibernate.model.Mascota;
import com.example.jpahibernate.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    // Inyeccion de dependencia
    @Autowired
    private IMascotaService mascoServ;

    // Alta mascota
    @PostMapping("/mascotas/crear")
    public String savePersona(@RequestBody Mascota masco) {
        mascoServ.saveMascota(masco);

        return "La mascota fue creada correctamente";
    }

}
