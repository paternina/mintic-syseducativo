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

import co.syseducativo.restapi.models.Materia;
import co.syseducativo.restapi.services.MateriaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/materia")
public class MateriaController {
    @Autowired
    MateriaService materiaService;

    @GetMapping(path = "/{id}")
    public Optional<Materia> getById(@PathVariable("id") Integer id) {
        return materiaService.getById(id);
    }

    @GetMapping()
    public ArrayList<Materia> getAllMaterias(@RequestParam(value = "isActive", required = false) Boolean isActive) {
        if (isActive != null) {
            return materiaService.getAllByIsActive(isActive);
        }
        return materiaService.getAll();
    }

    @PostMapping()
    public Materia saveMateria(@RequestBody Materia materia) {
        return materiaService.save(materia);
    }
}
