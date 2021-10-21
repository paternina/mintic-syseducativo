package co.syseducativo.restapi.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.syseducativo.restapi.models.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {
    public abstract ArrayList<Alumno> findByIsActive(Boolean isActive);
}
