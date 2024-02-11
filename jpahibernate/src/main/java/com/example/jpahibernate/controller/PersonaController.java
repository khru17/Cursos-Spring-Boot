package com.example.jpahibernate.controller;

import com.example.jpahibernate.model.Persona;
import com.example.jpahibernate.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    // Inyectando la dependencia service
    @Autowired
    private IPersonaService personaServ;

    @GetMapping("/personas/traer")
    public List<Persona> getPersonas() {
        return personaServ.getPersonas();
    }

    @PostMapping("/personas/crear")
    public String savePersona(@RequestBody Persona perso) {
        personaServ.savePersona(perso);

        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        personaServ.deletePersona(id);

        return "La persona fue eliminada correctamente";
    }

    @PutMapping("/personas/editar/{id_original}")
    public Persona editPersona(@PathVariable Long id_original,
                               @RequestParam(required = false, name = "id") Long nuevaId,
                               @RequestParam(required = false, name = "nombre") String nuevNombre,
                               @RequestParam(required = false, name = "apellido") String nuevoApellido,
                               @RequestParam(required = false, name = "edad") int nuevaEdad) {

        personaServ.editPersona(id_original, nuevaId, nuevNombre, nuevoApellido, nuevaEdad);

        Persona perso = personaServ.findPersona(nuevaId);

        return perso;

    }


    @PutMapping("/personas/editar")
    public Persona editPersona(@RequestBody Persona per) {
        personaServ.editPersona(per);

        return personaServ.findPersona(per.getId());
    }

}
