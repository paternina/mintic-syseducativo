package co.syseducativo.restapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syseducativo.restapi.models.Profesor;
import co.syseducativo.restapi.repositories.ProfesorRepository;

@Service
public class ProfesorService {
    @Autowired
    ProfesorRepository profesorRepository;

    public ArrayList<Profesor> getAll() {
        return (ArrayList<Profesor>) profesorRepository.findAll();
    }

    public Profesor save(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public Optional<Profesor> getById(Integer id) {
        return profesorRepository.findById(id);
    }

    public ArrayList<Profesor> getAllByIsActive(Boolean isActive) {
        return profesorRepository.findByIsActive(isActive);
    }
}
