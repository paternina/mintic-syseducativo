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

import co.syseducativo.restapi.models.CourseModel;
import co.syseducativo.restapi.services.CourseService;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping()
    public ArrayList<CourseModel> getCourse() {
        return courseService.getCourse();
    }

    @PostMapping()
    public CourseModel saveCourse(@RequestBody CourseModel courseModel) {
        return courseService.saveCourse(courseModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<CourseModel> getById(@PathVariable("id") Long id) {
        return courseService.getById(id);
    }

}
