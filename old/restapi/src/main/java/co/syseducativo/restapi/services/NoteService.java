package co.syseducativo.restapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.syseducativo.restapi.models.NoteModel;
import co.syseducativo.restapi.repositories.NoteRepository;

@Service
public class NoteService {
    @Autowired
    NoteRepository noteRepository;

    public ArrayList<NoteModel> getNote() {
        return (ArrayList<NoteModel>) noteRepository.findAll();
    }

    public NoteModel saveNote(NoteModel noteModel) {
        return noteRepository.save(noteModel);
    }

    public Optional<NoteModel> getById(Long id) {
        return noteRepository.findById(id);
    }
}
