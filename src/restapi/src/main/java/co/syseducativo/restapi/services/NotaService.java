package co.syseducativo.restapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syseducativo.restapi.models.Nota;
import co.syseducativo.restapi.repositories.NotaRepository;

@Service
public class NotaService {
    @Autowired
    NotaRepository notaRepository;

    public ArrayList<Nota> getAll() {
        return (ArrayList<Nota>) notaRepository.findAll();
    }

    public Nota save(Nota nota) {
        return notaRepository.save(nota);
    }

    public Optional<Nota> getById(Integer id) {
        return notaRepository.findById(id);
    }

    public ArrayList<Nota> getAllByIsActive(Boolean isActive) {
        return notaRepository.findByIsActive(isActive);
    }
}
