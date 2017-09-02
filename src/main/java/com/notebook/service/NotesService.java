package com.notebook.service;

import com.notebook.domain.Note;

import java.util.List;

public interface NotesService {
    List<Note> getAllNotes();
    List<Note> getNotesByCategory(String category);
    Note getNoteById(int noteId);
    void addNote(Note note);
    void updateNote(int noteId, Note note);
    void deleteNote(Note note);
    List<Note> searchByKeyword(String keyword);
}
