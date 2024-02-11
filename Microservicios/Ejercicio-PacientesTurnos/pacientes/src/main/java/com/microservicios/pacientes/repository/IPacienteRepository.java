package com.microservicios.pacientes.repository;

import com.microservicios.pacientes.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// Como el repositorio extiende de JpaRepository, nos permite usar los métodos para acceder a la base de datos
@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Long> {

    // Creando un metodo personalizado para realizar una consulta a la base de datos mediante el dni del paciente
    @Query("SELECT p FROM Paciente p WHERE p.dni = :dni")
    Paciente findByDni(String dni);

}
