package co.syseducativo.restapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.syseducativo.restapi.models.Alumno;
import co.syseducativo.restapi.services.AlumnoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/alumno")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping(path = "/{id}")
    public Optional<Alumno> getById(@PathVariable("id") Integer id) {
        return alumnoService.getById(id);
    }

    @GetMapping()
    public ArrayList<Alumno> getAllAlumnos(@RequestParam(value = "isActive", required = false) Boolean isActive) {
        if (isActive != null) {
            return alumnoService.getAllByIsActive(isActive);
        }
        return alumnoService.getAll();
    }

    @PostMapping()
    public Alumno saveAlumno(@RequestBody Alumno materia) {
        return alumnoService.save(materia);
    }
}
