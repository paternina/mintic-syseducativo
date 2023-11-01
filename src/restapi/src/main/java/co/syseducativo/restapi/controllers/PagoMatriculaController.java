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

import co.syseducativo.restapi.models.PagoMatricula;
import co.syseducativo.restapi.services.PagoMatriculaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/matricula")
public class PagoMatriculaController {
    @Autowired
    PagoMatriculaService pagoMatriculaService;

    @GetMapping(path = "/{id}")
    public Optional<PagoMatricula> getById(@PathVariable Integer id) {
        return pagoMatriculaService.getById(id);
    }

    @GetMapping()
    public ArrayList<PagoMatricula> getAllPagoMatriculas(
            @RequestParam(value = "isActive", required = false) Boolean fuePagada) {
        if (fuePagada != null) {
            return pagoMatriculaService.getAllFuePagada(fuePagada);
        }
        return pagoMatriculaService.getAll();
    }

    @PostMapping()
    public PagoMatricula savePagoMatricula(@RequestBody PagoMatricula materia) {
        return pagoMatriculaService.save(materia);
    }
}
