package co.syseducativo.restapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.syseducativo.restapi.models.NoteModel;

@Repository
public interface NoteRepository extends CrudRepository<NoteModel, Long>{
    
}
