package co.syseducativo.restapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syseducativo.restapi.models.CoordinatorModel;
import co.syseducativo.restapi.repositories.CoordinatorRepository;

@Service
public class CoordinatorService {
    @Autowired
    CoordinatorRepository coordinatorRepository;

    public ArrayList<CoordinatorModel> getCoordinator() {
        return (ArrayList<CoordinatorModel>) coordinatorRepository.findAll();
    }

    public CoordinatorModel saveCoordinator(CoordinatorModel coordinatorModel) {
        return coordinatorRepository.save(coordinatorModel);
    }

    public Optional<CoordinatorModel> getById(Long id) {
        return coordinatorRepository.findById(id);
    }
}
