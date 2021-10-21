package co.syseducativo.restapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.syseducativo.restapi.models.CoordinatorModel;

@Repository
public interface CoordinatorRepository extends CrudRepository<CoordinatorModel, Long>{
    
}
