package co.syseducativo.restapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syseducativo.restapi.models.CourseModel;
import co.syseducativo.restapi.repositories.CourseRepository;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public ArrayList<CourseModel> getCourse() {
        return (ArrayList<CourseModel>) courseRepository.findAll();
    }

    public CourseModel saveCourse(CourseModel courseModel) {
        return courseRepository.save(courseModel);
    }

    public Optional<CourseModel> getById(Long id) {
        return courseRepository.findById(id);
    }
}
