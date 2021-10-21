package co.syseducativo.restapi.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.syseducativo.restapi.models.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Integer> {
    public abstract ArrayList<Curso> findByIsActive(Boolean isActive);
}
