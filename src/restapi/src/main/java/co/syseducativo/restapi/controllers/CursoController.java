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

import co.syseducativo.restapi.models.Curso;
import co.syseducativo.restapi.services.CursoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/curso")
public class CursoController {
    @Autowired
    CursoService cursoService;

    @GetMapping(path = "/{id}")
    public Optional<Curso> getById(@PathVariable Integer id) {
        return cursoService.getById(id);
    }

    @GetMapping()
    public ArrayList<Curso> getAllCursos(@RequestParam(required = false) Boolean isActive) {
        if (isActive != null) {
            return cursoService.getAllByIsActive(isActive);
        }
        return cursoService.getAll();
    }

    @PostMapping()
    public Curso saveCurso(@RequestBody Curso materia) {
        return cursoService.save(materia);
    }
}
