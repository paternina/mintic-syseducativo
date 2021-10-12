package co.syseducativo.restapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.syseducativo.restapi.models.CourseModel;

@Repository
public interface CourseRepository extends CrudRepository<CourseModel, Long>{
    
}
