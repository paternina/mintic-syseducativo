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

import co.syseducativo.restapi.models.SubjectModel;
import co.syseducativo.restapi.services.SubjectService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/subjects")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @GetMapping()
    public ArrayList<SubjectModel> obtenerMaterias() {
        return subjectService.getSubjects();
    }

    @PostMapping()
    public SubjectModel saveSubject(@RequestBody SubjectModel subjectModel) {
        return subjectService.saveSubject(subjectModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<SubjectModel> getById(@PathVariable Long id) {
        return subjectService.getById(id);
    }

}
