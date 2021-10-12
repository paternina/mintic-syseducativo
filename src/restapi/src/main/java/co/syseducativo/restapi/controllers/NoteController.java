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

import co.syseducativo.restapi.models.NoteModel;
import co.syseducativo.restapi.services.NoteService;

@RestController
@RequestMapping("/api/v1/note")
public class NoteController {
    @Autowired
    NoteService noteService;

    @GetMapping()
    public ArrayList<NoteModel> getNote() {
        return noteService.getNote();
    }

    @PostMapping()
    public NoteModel saveNote(@RequestBody NoteModel noteModel) {
        return noteService.saveNote(noteModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<NoteModel> getById(@PathVariable("id") Long id) {
        return noteService.getById(id);
    }
}
