package co.syseducativo.restapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syseducativo.restapi.models.Alumno;
import co.syseducativo.restapi.repositories.AlumnoRepository;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;

    public ArrayList<Alumno> getAll() {
        return (ArrayList<Alumno>) alumnoRepository.findAll();
    }

    public Alumno save(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    public Optional<Alumno> getById(Integer id) {
        return alumnoRepository.findById(id);
    }

    public ArrayList<Alumno> getAllByIsActive(Boolean isActive) {
        return alumnoRepository.findByIsActive(isActive);
    }
}
