package co.syseducativo.restapi.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.syseducativo.restapi.models.Materia;

@Repository
public interface MateriaRepository extends CrudRepository<Materia, Integer> {
    public abstract ArrayList<Materia> findByIsActive(Boolean isActive);
}
