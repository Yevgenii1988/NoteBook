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
}
