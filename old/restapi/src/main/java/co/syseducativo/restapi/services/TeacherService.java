package co.syseducativo.restapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syseducativo.restapi.models.TeacherModel;
import co.syseducativo.restapi.repositories.TeacherRepository;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    public ArrayList<TeacherModel> getTeacher() {
        return (ArrayList<TeacherModel>) teacherRepository.findAll();
    }

    public TeacherModel saveTeacher(TeacherModel teacherModel) {
        return teacherRepository.save(teacherModel);
    }

    public Optional<TeacherModel> getById(Long id) {
        return teacherRepository.findById(id);
    }
}
