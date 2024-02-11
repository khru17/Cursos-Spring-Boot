package com.example.jpahibernate.service;

import com.example.jpahibernate.model.Mascota;
import com.example.jpahibernate.model.Persona;

import java.util.List;

public interface IMascotaService {

    public List<Mascota> getMascotas();

    public void saveMascota(Mascota masco);

    public void deleteMascota(Long id_mascota);

    public Mascota findMascota(Long id_mascota);

    public void editMascota(Long idOriginal, Long id_mascotaNueva, String nuevoNombre,
                            String nuevaEspecie, String nuevaRaza, String nuevoColor);
}
