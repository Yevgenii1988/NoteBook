package com.notebook.repository;

import com.notebook.domain.Note;

import java.util.List;

public interface NotesRepository {
    List<Note> getAllNotes();
}
