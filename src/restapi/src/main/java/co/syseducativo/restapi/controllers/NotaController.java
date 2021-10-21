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

import co.syseducativo.restapi.models.Nota;
import co.syseducativo.restapi.services.NotaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/nota")
public class NotaController {
    @Autowired
    NotaService notaService;

    @GetMapping(path = "/{id}")
    public Optional<Nota> getById(@PathVariable("id") Integer id) {
        return notaService.getById(id);
    }

    @GetMapping()
    public ArrayList<Nota> getAllNotas(@RequestParam(value = "isActive", required = false) Boolean isActive) {
        if (isActive != null) {
            return notaService.getAllByIsActive(isActive);
        }
        return notaService.getAll();
    }

    @PostMapping()
    public Nota saveNota(@RequestBody Nota materia) {
        return notaService.save(materia);
    }
}
