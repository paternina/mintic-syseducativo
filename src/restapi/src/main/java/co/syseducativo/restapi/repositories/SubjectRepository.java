package co.syseducativo.restapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.syseducativo.restapi.models.SubjectModel;

@Repository
public interface SubjectRepository extends CrudRepository<SubjectModel, Long> {

}
