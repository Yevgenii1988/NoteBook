package com.notebook.repository;

import com.notebook.domain.Note;

import java.util.List;

public interface NotesRepository {
    List<Note> getAllNotes();
    List<Note> getNotesByCategory(String category);
    Note getNoteById(int noteId);
    void addNote(Note note);
    void updateNote(Note note);
    void deleteNote(Note note);
}
