package co.syseducativo.restapi.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.syseducativo.restapi.models.PagoMatricula;

@Repository
public interface PagoMatriculaRepository extends CrudRepository<PagoMatricula, Integer> {
    public abstract ArrayList<PagoMatricula> findByFuePagada(Boolean fuePagada);
}
