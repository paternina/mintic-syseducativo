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

import co.syseducativo.restapi.models.Coordinador;
import co.syseducativo.restapi.services.CoordinadorService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/coodinador")
public class CoordinadorController {
    @Autowired
    CoordinadorService coordinadorService;

    @GetMapping(path = "/{id}")
    public Optional<Coordinador> getById(@PathVariable("id") Integer id) {
        return coordinadorService.getById(id);
    }

    @GetMapping()
    public ArrayList<Coordinador> getAllCoordinadors(
            @RequestParam(value = "isActive", required = false) Boolean isActive) {
        if (isActive != null) {
            return coordinadorService.getAllByIsActive(isActive);
        }
        return coordinadorService.getAll();
    }

    @PostMapping()
    public Coordinador saveCoordinador(@RequestBody Coordinador materia) {
        return coordinadorService.save(materia);
    }
}
