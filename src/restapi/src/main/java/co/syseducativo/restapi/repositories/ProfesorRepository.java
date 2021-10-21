package co.syseducativo.restapi.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import co.syseducativo.restapi.models.Profesor;

public interface ProfesorRepository extends CrudRepository<Profesor, Integer> {
    public abstract ArrayList<Profesor> findByIsActive(Boolean isActive);
}
