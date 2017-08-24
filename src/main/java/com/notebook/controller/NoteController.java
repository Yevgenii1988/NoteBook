package com.notebook.controller;

import com.notebook.domain.Note;
import com.notebook.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("viewNote")
    public String getNoteById(@RequestParam("id") int noteId, Model model) {
        model.addAttribute("note", notesService.getNoteById(noteId));
        return "viewNote";
    }

    @RequestMapping(value = "/notes/add", method = RequestMethod.GET)
    public String getNewNoteForm(Model model) {
        Note newNote = new Note();
        model.addAttribute("newNote", newNote);
        return "addNote";
    }

    @RequestMapping(value = "/notes/add", method = RequestMethod.POST)
    public String addNewNote(@ModelAttribute("newNote") Note newNote) {
        notesService.addNote(newNote);
        return "redirect:/notes";
    }

    @RequestMapping(value = "/notes/editNote", method = RequestMethod.GET)
    public String getEditNoteForm(@RequestParam("id") int noteId, Model model) {
        model.addAttribute("noteToBeUpdated", notesService.getNoteById(noteId));
        return "editForm";
    }

    @RequestMapping(value = "/notes/updateNote", method = RequestMethod.POST)
    public String editNote(@ModelAttribute("noteToBeUpdated") Note noteToBeUpdated) {
        notesService.updateNote(noteToBeUpdated);
        return "redirect:/notes";
    }

    @RequestMapping("delete")
    public String delete(@RequestParam("id") int noteId, Model model) {
        Note noteToDelete = notesService.getNoteById(noteId);
        notesService.deleteNote(noteToDelete);
        return "redirect:/notes";
    }
}
