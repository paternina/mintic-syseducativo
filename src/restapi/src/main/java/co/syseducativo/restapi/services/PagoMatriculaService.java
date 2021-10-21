package co.syseducativo.restapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syseducativo.restapi.models.PagoMatricula;
import co.syseducativo.restapi.repositories.PagoMatriculaRepository;

@Service
public class PagoMatriculaService {
    @Autowired
    PagoMatriculaRepository pagoMatriculaRepository;

    public ArrayList<PagoMatricula> getAll() {
        return (ArrayList<PagoMatricula>) pagoMatriculaRepository.findAll();
    }

    public PagoMatricula save(PagoMatricula pagoMatricula) {
        return pagoMatriculaRepository.save(pagoMatricula);
    }

    public Optional<PagoMatricula> getById(Integer id) {
        return pagoMatriculaRepository.findById(id);
    }

    public ArrayList<PagoMatricula> getAllFuePagada(Boolean fuePagada) {
        return pagoMatriculaRepository.findByFuePagada(fuePagada);
    }
}
