package com.example.jpahibernate.service;

import com.example.jpahibernate.model.Persona;
import com.example.jpahibernate.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository persoRepo;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        // orElse() : en el caso de que no se encuentre a un persona con base en el id
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }

    @Override
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        // Buscar el objeto original
        Persona perso = this.findPersona(idOriginal);

        // Proceso de modificación a nivel lógico
        perso.setId(idNueva);
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setEdad(nuevaEdad);

        // Guardar los cambios
        this.savePersona(perso);
    }

    @Override
    public void editPersona(Persona per) {
        this.savePersona(per);
    }
}
