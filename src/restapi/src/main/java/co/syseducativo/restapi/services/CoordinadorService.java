package co.syseducativo.restapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syseducativo.restapi.models.Coordinador;
import co.syseducativo.restapi.repositories.CoordinadorRepository;

@Service
public class CoordinadorService {
    @Autowired
    CoordinadorRepository coordinadorRepository;

    public ArrayList<Coordinador> getAll() {
        return (ArrayList<Coordinador>) coordinadorRepository.findAll();
    }

    public Coordinador save(Coordinador coordinador) {
        return coordinadorRepository.save(coordinador);
    }

    public Optional<Coordinador> getById(Integer id) {
        return coordinadorRepository.findById(id);
    }

    public ArrayList<Coordinador> getAllByIsActive(Boolean isActive) {
        return coordinadorRepository.findByIsActive(isActive);
    }
}
