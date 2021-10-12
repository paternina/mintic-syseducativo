package co.syseducativo.restapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.syseducativo.restapi.models.StudentModel;
import co.syseducativo.restapi.services.StudentService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping()
    public ArrayList<StudentModel> getStudent() {
        return studentService.getStudent();
    }

    @PostMapping()
    public StudentModel saveStudent(@RequestBody StudentModel studentModel) {
        return studentService.saveStudent(studentModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<StudentModel> getById(@PathVariable("id") Long id) {
        return studentService.getById(id);
    }
}
