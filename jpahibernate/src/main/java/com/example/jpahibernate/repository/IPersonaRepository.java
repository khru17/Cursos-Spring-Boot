package com.example.jpahibernate.repository;

import com.example.jpahibernate.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Se usa para mapear como repositorio
// La interface extiende de JpaRepository (que maneja repositorios JPA)
// en los parametros <> deben de ir: <clase a persistir, tipo de dato de su ID>
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
