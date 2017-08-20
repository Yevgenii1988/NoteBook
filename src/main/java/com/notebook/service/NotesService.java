package com.notebook.service;

import com.notebook.domain.Note;

import java.util.List;

public interface NotesService {
    List<Note> getAllNotes();
    List<Note> getNotesByCategory(String category);
    Note getNoteById(int noteId);
}
