package com.notebook.controller;

import com.notebook.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoteController {

    @Autowired
    private NotesService notesService;

    @RequestMapping("/notes")
    public String notes(Model model) {
        model.addAttribute("notes", notesService.getAllNotes());
        return "notes";
    }

    @RequestMapping("/notes/{category}")
    public String getNotesByCategory(Model model, @PathVariable("category") String category) {
        model.addAttribute("notes", notesService.getNotesByCategory(category));
        return "notes";
    }
}
