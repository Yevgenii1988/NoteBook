package com.notebook.service;

import com.notebook.domain.Note;
import com.notebook.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServiceImpl implements NotesService {

    @Autowired
    private NotesRepository notesRepository;

    @Override
    public List<Note> getAllNotes() {
        return notesRepository.getAllNotes();
    }

    @Override
    public List<Note> getNotesByCategory(String category) {
        return notesRepository.getNotesByCategory(category);
    }

    @Override
    public Note getNoteById(int noteId) {
        return notesRepository.getNoteById(noteId);
    }

    @Override
    public void addNote(Note note) {
        notesRepository.addNote(note);
    }

    @Override
    public void updateNote(int noteId, Note note) {
        notesRepository.updateNote(noteId, note);
    }

    @Override
    public void deleteNote(Note note) {
        notesRepository.deleteNote(note);
    }

    @Override
    public List<Note> searchByKeyword(String keyword) {
        return notesRepository.searchByKeyword(keyword);
    }
}
