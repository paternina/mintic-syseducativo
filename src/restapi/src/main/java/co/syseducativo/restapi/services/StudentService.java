package co.syseducativo.restapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syseducativo.restapi.models.StudentModel;
import co.syseducativo.restapi.repositories.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public ArrayList<StudentModel> getStudent() {
        return (ArrayList<StudentModel>) studentRepository.findAll();
    }

    public StudentModel saveStudent(StudentModel studentModel) {
        return studentRepository.save(studentModel);
    }

    public Optional<StudentModel> getById(Long id) {
        return studentRepository.findById(id);
    }
}
