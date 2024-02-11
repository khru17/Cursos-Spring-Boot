package com.microservicios.turnos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class TurnoDTO {
    // Clase que es usada para DTO
    private LocalDate fecha;
    private String tratamiento;
    private String dniPaciente;
}
