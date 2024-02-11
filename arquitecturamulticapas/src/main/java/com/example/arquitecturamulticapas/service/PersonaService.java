package com.example.arquitecturamulticapas.service;

import com.example.arquitecturamulticapas.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements  IPersonaService{

    // Métodos de lógica de negocio
    @Override
    public void crearPersona(Persona per) {
        // Lógica de creación
        System.out.println("Persona creada");
    }

    @Override
    public List<Persona> traerPersonas() {
        // Lógica para devolver la lista de personas
        return null;
    }
}
