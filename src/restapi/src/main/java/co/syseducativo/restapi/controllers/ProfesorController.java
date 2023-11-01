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

import co.syseducativo.restapi.models.Profesor;
import co.syseducativo.restapi.services.ProfesorService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/profesor")
public class ProfesorController {
    @Autowired
    ProfesorService profesorService;

    @GetMapping(path = "/{id}")
    public Optional<Profesor> getById(@PathVariable Integer id) {
        return profesorService.getById(id);
    }

    @GetMapping()
    public ArrayList<Profesor> getAllProfesors(@RequestParam(required = false) Boolean isActive) {
        if (isActive != null) {
            return profesorService.getAllByIsActive(isActive);
        }
        return profesorService.getAll();
    }

    @PostMapping()
    public Profesor saveProfesor(@RequestBody Profesor materia) {
        return profesorService.save(materia);
    }
}
