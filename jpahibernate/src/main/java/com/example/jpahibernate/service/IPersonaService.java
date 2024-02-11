package com.example.jpahibernate.service;

import com.example.jpahibernate.model.Persona;

import java.util.List;

public interface IPersonaService {

    // método para traer todas las personas
    public List<Persona> getPersonas();

    // Método para dar de alta una persona
    public void savePersona(Persona perso);

    // Método para borrar una persona
    public void deletePersona(Long id);

    // Método para encontrar una persona
    public Persona findPersona(Long id);

    // edicion y modificacion
    // (Situación en el que se edita también el id)
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellifo, int nuevaEdad);


    void editPersona(Persona per);
}
