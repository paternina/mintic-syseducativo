package co.syseducativo.restapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syseducativo.restapi.models.SubjectModel;
import co.syseducativo.restapi.repositories.SubjectRepository;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    public ArrayList<SubjectModel> getSubjects() {
        return (ArrayList<SubjectModel>) subjectRepository.findAll();
    }

    public SubjectModel saveSubject(SubjectModel subjectModel) {
        return subjectRepository.save(subjectModel);
    }

    public Optional<SubjectModel> getById(Long id) {
        return subjectRepository.findById(id);
    }

}
