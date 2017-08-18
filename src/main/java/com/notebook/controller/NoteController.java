package com.notebook.controller;

import com.notebook.domain.Note;
import com.notebook.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoteController {

    @Autowired
    private NotesRepository notesRepository;

    @RequestMapping("/notes")
    public String notes(Model model) {
        model.addAttribute("notes", notesRepository.getAllNotes());
        return "notes";
    }
}
