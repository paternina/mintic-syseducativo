package co.syseducativo.restapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.syseducativo.restapi.models.TeacherModel;

@Repository
public interface TeacherRepository extends CrudRepository<TeacherModel, Long>{
    
}
