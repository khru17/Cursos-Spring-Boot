package com.microservicios.pacientes.service;

import com.microservicios.pacientes.model.Paciente;
import com.microservicios.pacientes.repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements  IPacienteService{

    // Para acceder a los métodos de JPA
    // Inyección de independencia
    @Autowired
    private IPacienteRepository pacienteRepo;

    @Override
    public List<Paciente> getPacientes() {
        return pacienteRepo.findAll();
    }

    @Override
    public void savePaciente(Paciente pac) {
        pacienteRepo.save(pac);
    }

    @Override
    public void deletePaciente(Long id) {
        pacienteRepo.deleteById(id);
    }

    @Override
    public Paciente findPaciente(Long id) {
        return pacienteRepo.findById(id).orElse(null);
    }

    @Override
    public void editPaciente(Long id, Paciente pac) {
        this.savePaciente(pac);
    }

    @Override
    public Paciente findPacienteDni(String dni) {
        return pacienteRepo.findByDni(dni);
    }


}
