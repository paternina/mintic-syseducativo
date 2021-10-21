package co.syseducativo.restapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syseducativo.restapi.models.Materia;
import co.syseducativo.restapi.repositories.MateriaRepository;

@Service
public class MateriaService {
    @Autowired
    MateriaRepository materiaRepository;

    public ArrayList<Materia> getAll() {
        return (ArrayList<Materia>) materiaRepository.findAll();
    }

    public Materia save(Materia materia) {
        return materiaRepository.save(materia);
    }

    public Optional<Materia> getById(Integer id) {
        return materiaRepository.findById(id);
    }

    public ArrayList<Materia> getAllByIsActive(Boolean isActive) {
        return materiaRepository.findByIsActive(isActive);
    }

}
