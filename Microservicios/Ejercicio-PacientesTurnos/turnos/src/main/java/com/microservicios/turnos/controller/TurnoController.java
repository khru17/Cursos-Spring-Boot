package com.microservicios.turnos.controller;

import com.microservicios.turnos.dto.TurnoDTO;
import com.microservicios.turnos.model.Turno;
import com.microservicios.turnos.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    private ITurnoService turnoServ;

    // 1 - Crear un nuevo turno
    @PostMapping("/crear")
    public String crearTurno(@RequestBody TurnoDTO turno) {
        turnoServ.saveTurno(turno.getFecha(), turno.getTratamiento(), turno.getDniPaciente());

        return "Turno creado correctamente";
    }

    // 2 -  Obtener todos los datos
    @GetMapping("/traer")
    public List<Turno> traerTurnos() {
        return turnoServ.getTurnos();
    }

    // 3 - Eliminar un turno
    @DeleteMapping("/borrar/{id}")
    public String deleteTurno(@PathVariable Long id) {
        turnoServ.deleteTurno(id);
        return "El turno fue eliminado correctamente";
    }

    // 4 -  Editar turno
    @PutMapping("/editar/{id_original}")
    public Turno editTurno(@PathVariable Long id_original,
                           @RequestBody Turno turnoEditar) {
        turnoServ.editTurno(id_original, turnoEditar);
        Turno turnoEditado = turnoServ.findTurno(id_original);

        return turnoEditado;
    }

    // 5 -  Obtener un turno en particular
    @GetMapping("/traer/{id}")
    public Turno traerTurno(@PathVariable Long id) {
        return turnoServ.findTurno(id);
    }
}
