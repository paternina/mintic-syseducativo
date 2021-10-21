package co.syseducativo.restapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syseducativo.restapi.models.Curso;
import co.syseducativo.restapi.repositories.CursoRepository;

@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;

    public ArrayList<Curso> getAll() {
        return (ArrayList<Curso>) cursoRepository.findAll();
    }

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Optional<Curso> getById(Integer id) {
        return cursoRepository.findById(id);
    }

    public ArrayList<Curso> getAllByIsActive(Boolean isActive) {
        return cursoRepository.findByIsActive(isActive);
    }
}
