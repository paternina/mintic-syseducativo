package co.syseducativo.restapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.syseducativo.restapi.models.StudentModel;

@Repository
public interface StudentRepository extends CrudRepository<StudentModel, Long>{
    
}
