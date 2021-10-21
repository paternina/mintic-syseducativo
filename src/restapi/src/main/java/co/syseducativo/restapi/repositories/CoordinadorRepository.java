package co.syseducativo.restapi.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import co.syseducativo.restapi.models.Coordinador;

public interface CoordinadorRepository extends CrudRepository<Coordinador, Integer> {
    public abstract ArrayList<Coordinador> findByIsActive(Boolean isActive);
}
