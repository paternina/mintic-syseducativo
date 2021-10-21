package co.syseducativo.restapi.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.syseducativo.restapi.models.Nota;

@Repository
public interface NotaRepository extends CrudRepository<Nota, Integer> {
    public abstract ArrayList<Nota> findByIsActive(Boolean isActive);
}
