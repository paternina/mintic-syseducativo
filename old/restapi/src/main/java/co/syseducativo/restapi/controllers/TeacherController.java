package co.syseducativo.restapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.syseducativo.restapi.models.TeacherModel;
import co.syseducativo.restapi.services.TeacherService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping()
    public ArrayList<TeacherModel> getTeacher() {
        return teacherService.getTeacher();
    }

    @PostMapping()
    public TeacherModel saveTeacher(@RequestBody TeacherModel teacherModel) {
        return teacherService.saveTeacher(teacherModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<TeacherModel> getById(@PathVariable Long id) {
        return teacherService.getById(id);
    }
}
