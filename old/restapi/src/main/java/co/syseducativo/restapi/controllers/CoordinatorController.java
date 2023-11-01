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

import co.syseducativo.restapi.models.CoordinatorModel;
import co.syseducativo.restapi.services.CoordinatorService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/coordinator")
public class CoordinatorController {
    @Autowired
    CoordinatorService coordinatorService;

    @GetMapping()
    public ArrayList<CoordinatorModel> getCoordinator() {
        return coordinatorService.getCoordinator();
    }

    @PostMapping()
    public CoordinatorModel saveCoordinator(@RequestBody CoordinatorModel coordinatorModel) {
        return coordinatorService.saveCoordinator(coordinatorModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<CoordinatorModel> getById(@PathVariable Long id) {
        return coordinatorService.getById(id);
    }

}
